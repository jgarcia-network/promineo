package coding_assignment;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private PlayerDao playerDao = new PlayerDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList("Display Roster", "Add Player", "Edit Player", "Delete Player", "Exit");
	
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try {
			if (selection.equals("1")) {
				displayPlayers();
			} else if (selection.equals("2")) {
				createPlayer();
			} else if (selection.equals("3")) {
				editPlayer();
			} else if (selection.equals("4")) {
				deletePlayer();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Press enter to continue....");
			scanner.nextLine();
			
		} while (!selection.equals("5"));
	}
	
	private void printMenu() {
		System.out.println("**Las Vegas Raiders**\n## Roster Manager ##\nSelect an option...\n");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ". " + options.get(i));
		}
	}
	
	private void displayPlayers() throws SQLException {
		List<Roster> players = playerDao.getPlayers();
		for (Roster player : players) {
		System.out.println("ID: " + player.getPlayerId() + ", Name: " + player.getName() + ", Position: " + player.getPosition());
		}
	}
	
	private void createPlayer() throws SQLException {
		System.out.println("Enter player name:");
		String name = scanner.nextLine();
		System.out.println("Enter player position:");
		String position = scanner.nextLine();
		playerDao.createPlayer(name, position);
		System.out.println("Player created");
		displayPlayers();
	}
	
	private void editPlayer() throws SQLException {
		displayPlayers();
		System.out.println("Enter player ID:");
		String stringID = scanner.nextLine();
		int id = Integer.parseInt(stringID);
		System.out.println("Enter new player Name:");
		String name = scanner.nextLine();
		System.out.println("Enter new player Position:");
		String position = scanner.nextLine();
		playerDao.editPlayer(name, position, id);
		System.out.println("Player succefully edited");
		displayPlayers();		
	}
	
	private void deletePlayer() throws SQLException {
		displayPlayers();
		System.out.println("Enter player id to delete");
		String stringID = scanner.nextLine();
		int id = Integer.parseInt(stringID);
		playerDao.deletePlayer(id);
		System.out.println("Player " +  id + " deleted");
		displayPlayers();
	}


}

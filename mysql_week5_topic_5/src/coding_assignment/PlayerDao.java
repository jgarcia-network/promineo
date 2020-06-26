package coding_assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {

	private Connection connection;
	private final String GET_ROSTER_QUERY = "SELECT * FROM roster";
	private final String CREATE_PLAYER_QUERY = "INSERT INTO roster(name, position) VALUES(?, ?)";
	private final String EDIT_PLAYER_QUERY = "UPDATE roster SET name = (?), position = (?) WHERE id = (?)";
	private final String DELETE_PLAYER_QUERY = "DELETE FROM roster WHERE id = (?)";
	
	
	public PlayerDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<Roster> getPlayers() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_ROSTER_QUERY).executeQuery();
		List<Roster> players = new ArrayList<Roster>();
		
		while (rs.next()) {
			players.add(populatePlayer(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		return players;
	}
	
	private Roster populatePlayer(int id, String name, String position) {
		return new Roster(id, name, position);
	}
	
	public void createPlayer(String name, String position) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_PLAYER_QUERY);
		ps.setString(1, name);
		ps.setString(2, position);
		ps.executeUpdate();
		ps.close();
	}
	
	public void editPlayer(String name, String position, int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(EDIT_PLAYER_QUERY);
		ps.setString(1, name);
		ps.setString(2, position);
		ps.setInt(3, id);
		ps.executeUpdate();
		ps.close();
	}
	
	public void deletePlayer(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_PLAYER_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
	}
	
}

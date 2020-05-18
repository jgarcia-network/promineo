package week6_final_project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();

		Player playerOne = new Player("1");
		Player playerTwo = new Player("2");

		//System.out.println(playerOne.name);

		deck.shuffle();
		
		//System.out.println(deck);

		for (int i = 0; i < 52; i++) {
			//every other iteration?
			if ( i % 2 == 0) {
			   playerOne.draw(deck);
			} else {
			   playerTwo.draw(deck);
			}
		}

		
		for (int i = 0; i < 26; i++) {
			Card playerOneCard = playerOne.flip();
			int playerOneScore = playerOneCard.getValue();
			
			
			Card playerTwoCard = playerTwo.flip();
			int playerTwoScore = playerTwoCard.getValue();
			
			if (playerOneScore > playerTwoScore) {
				playerOne.incrementScore();
			} else if (playerOneScore < playerTwoScore) {
				playerTwo.incrementScore();
			}
		}
		
		if (playerOne.score > playerTwo.score){
			System.out.println("Player 1 Score: " + playerOne.score + ", Player 2 Score: " + playerTwo.score + "\nPlayer 1 Wins!");
		} else if (playerOne.score < playerTwo.score) {
			System.out.println("Player 1 Score: " + playerOne.score + ", Player 2 Score: " + playerTwo.score + "\nPlayer 2 Wins!");
		} else {
			System.out.println("Player 1 Score: " + playerOne.score + ", Player 2 Score: " + playerTwo.score + "\nDraw!");
		}
		
		

	}

}

package week6_final_project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();

	public int score = 0;
	private String name;
	
	// assuming score needs a method
    public Player() {
        this.score= 0;
    }
	
	// assuming name needs a method
	public Player(String name) {
		this.name = name;
	}

	public void desribe() {
		System.out.println("Name: " + name + "Score: " + score + "Hand: " + hand);
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void incrementScore() {
		score++;
	}

}

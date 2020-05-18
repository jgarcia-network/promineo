package week6_final_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	List<String> suits = new ArrayList<String>();

	public Deck() {

		suits.add("Diamonds");
		suits.add("Clubs");
		suits.add("Hearts");
		suits.add("Spades");

		for (int i = 2; i < 15; i++) {

			for (String suit : suits) {
				//System.out.println(i + " of " + suit);
				cards.add(new Card(i, suit));
			}
			
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		return cards.remove(0);
	}

}

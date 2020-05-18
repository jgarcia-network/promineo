package week6_final_project;

public class Card {

	private int value;
	private String name;
	
	public Card(int value, String suit) {
		
	this.value += value;
	
    switch(value) {
    case 2: name = "2";
        break;
    case 3: name = "3";
        break;
    case 4: name = "4";
        break;
    case 5: name = "5";
        break;
    case 6: name = "6";
        break;
    case 7: name = "7";
        break;
    case 8: name = "8";
        break;
    case 9: name = "8";
        break;
    case 10: name = "10";
        break;
    case 11: name = "Jack";
        break;
    case 12: name = "Queen";
        break;
    case 13: name = "King";
        break;
    case 14: name = "Ace";
        break;
    }
    
    this.name += suit;

   	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name);
	}
	
	
	
}

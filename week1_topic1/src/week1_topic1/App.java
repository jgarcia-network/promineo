package week1_topic1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice = 3.50;
		double walletAmount = 5;
		int friends = 10;
		int age = 0;
		String firstName = "Jesus";
		String lastName = "Garcia";
		char initial = 'L';
		
		double change = walletAmount - itemPrice;
		int numberFriends = age + friends;
		String fullName = firstName + " " + initial + " " + lastName;
	
		System.out.printf("Money left in my wallet is $%.2f\n" , change);
		System.out.println("Number of friends I've made each year is " + numberFriends);
		System.out.println("My full name is " + fullName);
		
	}

}

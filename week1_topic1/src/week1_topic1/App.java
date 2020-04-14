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
		System.out.println("My full name is " + fullName + System.lineSeparator());
		
		//second set
		
		double salePrice = 10.70;
		double slushFunds = 500.00;
		int colleagues = 5;
		int ageYear = 20;
		String studentName = "Jesus";
		String studentLastname = "Garcia";
		char middleInitial = 'L';
		
		double surplus = slushFunds - salePrice;
		int numberColleagues = ageYear + colleagues;
		String studentFullname = studentName + " " + middleInitial + " " + studentLastname;
	
		System.out.printf("Money left in my wallet is $%.2f\n" , surplus);
		System.out.println("Number of colleauges I've had each year is " + numberColleagues);
		System.out.println("My full student name is " + studentFullname);
		
	}

}

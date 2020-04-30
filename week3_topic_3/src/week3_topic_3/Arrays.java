package week3_topic_3;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		int[] ages = new int[9];

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		// added new element
		ages[8] = 100;

		// subtract first element from last
		int i = 1;
		int sub = 0;

		while (i < ages.length) {
			sub = ages[0] - ages[i];
			i++;
		}
		System.out.println("The first element minus the last element in this array is " + sub);

		// array average for loop
		double sum = 0;
//		for (int i = 0; i <= ages.length-1; i++) {
//			//System.out.println(ages[i]);
//			sum += ages[i];
//			}
//		//System.out.println(sum);
//		System.out.println("The average of this array is " + (sum / ages.length));

		// array average enhanced for loop
		for (int age : ages) {
			sum += age;
			// System.out.println(age);
		}
		System.out.println("The average of this array is " + (sum / ages.length));

		// 2.
		// average character in names
		String[] names = new String[6];

		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		double count = 0;

		for (String name : names) {
			count += name.length();
			// System.out.println(name + " is " + name.length() + " characters long");
		}
		System.out.println("The average number of characters per name is " + (count / names.length));

		// concatenate all names
		String str = "";

		for (String name : names) {
			str += (name + " ");
		}
		System.out.println(str);

		// 3.
		// access first element of array
		System.out.println(names[0]);

		// 4.
		// access last element in array
		System.out.println(names[names.length-1]);

		// 5.
		int[] nameLengths = new int[6];

		for (int j = 0; j < names.length; j++) {
			nameLengths[j] = names[j].length();
			System.out.println(nameLengths[j]);
		}

		// 6.
		int sumNames = 0;

		for (int length : nameLengths) {
			sumNames += length;
			// System.out.println(sumNames);
		}
		System.out.println(sumNames);

		// 7.
		seven("Hello", 3);
		
		//8.
		eight("Jesus", "Garcia");
		
		//9.
		int[] someNumbers = new int[6];

		someNumbers[0] = 5;
		someNumbers[1] = 10;
		someNumbers[2] = 15;
		someNumbers[3] = 20;
		someNumbers[4] = 25;
		someNumbers[5] = 30;
		
		boolean greaterOnehundred = nine(someNumbers);
		System.out.println(greaterOnehundred);
		
		//10.
		double[] someMoreNumbers = new double[5];

		someMoreNumbers[0] = 1.5;
		someMoreNumbers[1] = 2.5;
		someMoreNumbers[2] = 3.5;
		someMoreNumbers[3] = 4.5;
		someMoreNumbers[4] = 5.5;
		
		double arrayAverage = ten(someMoreNumbers);
		System.out.println(arrayAverage);
		
		//11.
		double[] evenMoreNumbers = new double[5];

		evenMoreNumbers[0] = 2.5;
		evenMoreNumbers[1] = 3.5;
		evenMoreNumbers[2] = 4.5;
		evenMoreNumbers[3] = 5.5;
		evenMoreNumbers[4] = 6.5;
		
		double[] gimmieMoreNumbers = new double[5];

		gimmieMoreNumbers[0] = 1.5;
		gimmieMoreNumbers[1] = 2.5;
		gimmieMoreNumbers[2] = 3.5;
		gimmieMoreNumbers[3] = 4.5;
		gimmieMoreNumbers[4] = 5.5;
		
		boolean whichArray = eleven(evenMoreNumbers, gimmieMoreNumbers);
		System.out.println(whichArray);
		
		//12.
		boolean isHotOutside = true;
		double moneyInPocket = 20.00;
		
		boolean drank = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will you buy me a drank? ... " + drank);
		
		//13.
		
		String[] teams = new String[4];

		teams[0] = "Denver";
		teams[1] = "Kansas City";
		teams[2] = "Las Vegas";
		teams[3] = "Los Angeles";
		
		String[] coaches = new String[4];

		coaches[0] = "Vic Fangio";
		coaches[1] = "Andy Reid";
		coaches[2] = "Vic Fangio";
		coaches[3] = "Anthony Lynn";
		
		afcWest(teams, coaches);
		
		

	}

	//<!-------------ALL REQUIRED METHODS BELOW-----------------!>
	
	
	// 7.
	public static String seven(String word, int n) {
		int i = 0;
		String cont = "";
		while (i < n) {
			cont += word;
			i++;
		}
		return cont;
	}
	
	//8.
	public static String eight(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9.
	public static boolean nine(int[] array) {
		int arrayCount = 0;
		for (int number : array) {
			arrayCount += number;
			//System.out.println(arrayCount);
		} if (arrayCount > 100) {
			return true;
		} else {
			return false;
		}		
	}	
	
	
	//10.
	public static double ten(double[] array) {
		double arrayCount = 0;
		for (double number : array) {
			arrayCount += number;
			//System.out.println(number);
		}
		return arrayCount / array.length;
	}
	
	//11.
	public static boolean eleven(double[] arrayOne, double[] arrayTwo) {
		double arrayCountFirst = 0;
		double arrayCountSecond = 0;
		for (double number : arrayOne) {
			arrayCountFirst += number;
		}
		for (double number : arrayTwo) {
			arrayCountSecond += number;
		}		
		 if (arrayCountFirst/arrayOne.length > arrayCountSecond/arrayTwo.length) {
			 return true;
		 } else {
			 return false;
		 }
	}
		
	//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	//13.
	//This method matches team with coach
	//accepts two string arrays with same length and concatenates team to coach
	public static void afcWest(String[] teams, String[] coaches) {
			
		for (int i = 0; i < teams.length; i++) {
			System.out.println(teams[i] + " Coach " + coaches[i]);
		}
	}
		
		
	
}

package week3_topic_3;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = new int [9];
		
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
		
		//array average for loop
		double sum = 0;
//		for (int i = 0; i <= ages.length-1; i++) {
//			//System.out.println(ages[i]);
//			sum += ages[i];
//			}
//		//System.out.println(sum);
//		System.out.println("The average of this array is " + (sum / ages.length));
		
		//array average enhanced for loop
		for (int age : ages){
			sum += age;
			//System.out.println(age);
			}		
		System.out.println("The average of this array is " + (sum / ages.length));
		
		
		// average character in names
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double count = 0;
		
		for (String name : names){
			count += name.length();
			//System.out.println(name + " is " + name.length() + " characters long");		
			}		
		System.out.println("The average number of characters per name is " + (count / names.length));
		
		//concatenate all names
		String str = "";
		
		for (String name : names){
			str += (name + " ");		
			}
		System.out.println(str);
		
		
		
		
	}

}

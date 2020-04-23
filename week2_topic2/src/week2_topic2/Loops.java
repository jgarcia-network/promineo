package week2_topic2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

		while (i <= 100) {
			if (i % 2 == 0) {
				//System.out.println(i);
			}
			i++;
		}

		int j = 100;

		while (j >= 0) {
			if (j % 3 == 0) {
				//System.out.println(j);
			}
			j--;
		}	

		
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 1) {
				//System.out.println(k);
			}
		}
		
		for (int l = 1; l <= 100; l++) {
			if (l % 3 == 0 && l % 5 == 0) {
				System.out.println("HelloWorld");
			} else if (l % 3 == 0) {
				System.out.println("Hello");
			} else if (l % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(l);
			}
		}
		 

	}

}

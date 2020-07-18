package day2;

public class LoopExecution {

	public static void main(String[] args) {

		int x = 300;

		if (x >= 200) {
			System.out.println("Hello from 1");
		}

		if (x > 200)
			System.out.println("Heelohkjh");

		if (x <= 200) {
			System.out.println("Hello from 2");
		}

		if (x < 200) {
			System.out.println("Number less than 200 from 1");
		} else {
			System.out.println("Number is greater than 200 from 1hkjhk");
		}

		if (x < 100) {
			System.out.println("Number is less than 100 from 2");
		} else if (x < 200) {
			System.out.println("Number is less than 200 from 2");
		} else if (x < 300) {
			System.out.println("Number is less than 100 from 2");
		} else {
			System.out.println("Number is less than 200 from 2");
		}

		int y = 200;

		if (y > 100) {
			System.out.println("Print y");
			if (y >= 200) {
				System.out.println("Print y from inside");
			}
		}
		// Logical Operation
		if (true) {
			System.out.println("True from here");
		}

		if (false) {
			System.out.println("False from here");
		}

		boolean flag = true;

		if (!flag) {
			System.out.println("True from here");
		} else {
			System.out.println("False from here");
		}
		
		x = 200;
		y = 900;
		int z = 909;
		
		if(x > 100 && x <300) {
			System.out.println("Number is between 100 and 300");
		}
		
		if(x > 100 || x <300) {
			System.out.println("Number is not between 100 and 300");
		}
		
		
	}
}

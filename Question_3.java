package Lab_2_User_Input;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {

		int total = sum();
		System.out.println("Sum of all integer numbers is: " + total);

	}

	public static int sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive nonzero integer number: ");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;

		}
		return sum;
	}
}
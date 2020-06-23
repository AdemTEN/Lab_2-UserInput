package Lab_2_User_Input;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int number1 = scan.nextInt();
		System.out.print("Enter your next number: ");
		int number2 = scan.nextInt();
		int largest;
		int smallest;
		if (number1 > number2) {
			largest = number1;
			smallest = number2;
		}else {
			largest = number2;
			smallest = number1;
		}
		int yesOrNo;
		
		do {
			System.out.print("Do you want to enter another number : 0-No, 1-Yes: ");
			yesOrNo = scan.nextInt();
			if (yesOrNo == 0) {
				break;
			}

			System.out.print("Enter your next number: ");
			int number3 = scan.nextInt();
			if (number3 > largest ) {
				largest  = number3;
			}
			if (number3 < smallest ) {
				smallest = number3;
			}
		} while (yesOrNo == 1);
		System.out.println("Smallest number is:"+ smallest);
		System.out.println("Largest number is: " + largest);
		}
	}
	



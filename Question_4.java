package Lab_2_User_Input;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of males registered in class: ");
		double males = scan.nextInt();
		
		System.out.print("Enter the number of females registered in class:");
		double females = scan.nextInt();
		
		double totalRegistered = females + males;
		
		double pecentageOfMales = (males / totalRegistered) * 100;
		double percentageOfFemales = (females / totalRegistered) * 100;
		
		System.out.println("The percentage of males is: %" + (int)(pecentageOfMales * 100) / 100.0);
		System.out.println("The percentage of females is: %" + (int)(percentageOfFemales * 100) / 100.0);
	}

}

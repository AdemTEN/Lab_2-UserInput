package Lab_2_User_Input;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the charge for the meal:  ");
		double charge = scan.nextDouble();
		
		double tax = (charge * 6.75) / 100; 
		double total = charge + tax;
		double tip = (total * 20) / 100;
		double totalBill = total + tip;
		
		System.out.println("The charge of meal:" +charge);
		System.out.println("The tax of charge: " + tax);
		System.out.println("Amount of tip: " + tip);
		System.out.println("Total bill: "  + totalBill);
	}

}

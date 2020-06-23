package Lab_2_User_Input;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		int totalCokiees = 40;
		int totalServing=  10;
		int totalCaloriesInTotalServing = 300;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number of cookies which he total consumed: ");
		int consumedCookies = scan.nextInt();
		
		double cookiesInOneServing = totalCokiees / totalServing;
		double oneCookiesCalories = totalCaloriesInTotalServing / cookiesInOneServing;
		
		double totalConsumedCalories = consumedCookies * oneCookiesCalories;
		System.out.println("Total calories consumed is: " + totalConsumedCalories + " calories");
	}

}

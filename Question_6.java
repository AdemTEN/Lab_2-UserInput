package Lab_2_User_Input;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter amount of purchase: ");
		double purchase = scan.nextInt();
		double stateTax = purchase * (4.0 / 100);
		double countyTax = purchase * (2.0 / 100);
		double totalSaleTax = stateTax + countyTax;
		double totalOfSale = purchase + totalSaleTax;
		
		System.out.println("The amount of purchase: $" + purchase);
		System.out.println("   -The state sale tax:   $" + stateTax);
		System.out.println("   -The county sale tax:  $" + countyTax);
		System.out.println("   -The total sales tax:  $" + totalSaleTax + "\n+______________________________");
		System.out.println("The total of the sale:  $" + totalOfSale);
		
		
	}

}

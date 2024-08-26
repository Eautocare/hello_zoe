/**prompt the user to the amount he wants to borrow
store it
prompt the user for interest rate
store it
prompt the user the number of years
store it
calculate the monthly payment with the formula given**/

import java.util.Scanner;
public class BorrowFunds{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the principal amount: ");
		int amount = input.nextInt();

		System.out.print("Enter the annual interest rate: ");
		int rate = input.nextInt();

		System.out.print("Enter the duration in years: ");
		int duration = input.nextInt();

		double monthlyrate = amount/100;
		double numberofmonths = duration * 12;
	
		double newrate = monthlyrate * Math.pow(1+ monthlyrate, numberofmonths);

		double newrate2 = Math.pow(1+ monthlyrate, numberofmonths) - 1;
		
		double newamount = amount * newrate;
		double monthlyvalue = newamount/newrate2;

		System.out.print("Your monthly payment is " + monthlyvalue);
		
}
}
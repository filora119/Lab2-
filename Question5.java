package Assessment4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		double mealCharge;
		double tax = 0.067; 
		double taxAmount;
		double totalWithTax;
		double tip = 0.15; 
		double tipAmount; 
		double totalBill;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Please enter the charge for your meal $");
		mealCharge = keyboard.nextDouble();
		
		keyboard.nextLine();
				
		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;
		
		System.out.println("Your meal charge amount is $" + mealCharge + ".");
		System.out.println("Your tax amount is $" + taxAmount + ".");
		System.out.println("Your tip amount is $" + tipAmount + ".");
		System.out.println("Your total bill amount is $" + totalBill + ".");
				
	
		
		
		
	}

}

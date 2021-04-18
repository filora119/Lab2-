package Assessment4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
	//	Write a program that will ask the user 
		//to enter the amount of a purchase. 
		//The program should then compute the state and county tax sales tax.
		//Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
		//The program should display the amount of the purchase , the state sales tax, the county sales tax, the total sales tax, and the total of the sale 
		//(which is the sum of the amount of purchase plus the total sales tax)

		double amountOfperchase;
		double stateTax=0.04;
		double countyTax=0.02;
		double stateSaleTax;
		double countySaleTax;
		double totalSaleTax;
		double totalOfthesale;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the perchase amount $");
		amountOfperchase = keyboard.nextDouble();
		
		keyboard.nextLine();

		stateSaleTax=amountOfperchase*stateTax;
		countySaleTax=amountOfperchase*countyTax;
		totalSaleTax=stateSaleTax+countySaleTax;
		totalOfthesale=amountOfperchase+totalSaleTax;
		
		System.out.println("Your amount of perchase $" + amountOfperchase + ":");
		System.out.println("State tax amount is $" + stateSaleTax + ":");
		System.out.println("County tax is $" + countySaleTax + ":");
		System.out.println("Total sale tax is $" + totalSaleTax + ":");
		System.out.println("Total of the sale is $" + totalOfthesale + ":");

		
	}

}

package Assessment4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many cookies you ate: ");

		int cookieNumber=sc.nextInt();
		
		int ServingSize=40/10;
		int CaloriePerCookie=300/ServingSize;
		int totalCalorie=cookieNumber*CaloriePerCookie;

		System.out.println("TotalCalorie: "+totalCalorie);

		
		
	}

}

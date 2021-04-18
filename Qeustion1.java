package Assessment4;

import java.util.Scanner;

public class Qeustion1 {

	public static void main(String[] args) {
	     numberChecker();


	    }

	    public static void numberChecker() {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter your first number");
	        int num = input.nextInt();
	        int smallest = num;
	        int largest = num;
	        int decider;

	        do {
	            System.out.println("Enter your next number: ");
	            num = input.nextInt();

	            System.out.println("Do you want to enter another number? 0-No, 1-Yes");
	            decider = input.nextInt();

	            if (num < smallest) {
	                smallest = num;
	            } else if (num > largest) {
	                largest = num;
	            }

	            if (decider != 0 && decider !=1) {
	                System.out.println("invalid request!! Program is going to stop execution with"
	                        + " current result.....");
	                break;
	            }

	        } while (decider == 1);

	        System.out.println("Largest number is: " + largest);
	        System.out.println("Smallest number is: " + smallest);
	    }


         
	}



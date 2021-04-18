package Assessment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);

	 	 System.out.print("Enter number of male: ");
			int numberOfmale=sc.nextInt();

		 System.out.print("Enter number of female: ");
            int numberOffemale=sc.nextInt();
		
        double percentageOffemale=((double)numberOffemale/(numberOfmale+numberOffemale)*100);
	    double percentageOfmale=((double)numberOfmale/(numberOfmale+numberOffemale)*100);
	    

	     System.out.println("Percentage of male number: " + percentageOfmale);
	     System.out.println("Percentage of female number: " + percentageOffemale);


	    }
	    
	    

		
		
		
	}



package Assessment4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
            
 
	    int i=0;
	    int sum=0;
		Scanner sc=new Scanner(System.in);
	   
	    do{
		    System.out.println("Enter your number: ");	
		    i=sc.nextInt();
	    
		    if(i<=0) {
		    	break;
		    }else {
		    	sum=sum+i;
		    }
       }while(true);
	
	System.out.println("Total is: "+ sum);

}

}
	

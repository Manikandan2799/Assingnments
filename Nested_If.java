package task;

import java.util.Scanner;

public class _Nested_If{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Enter The Marital Status");
       char marital=in.next().charAt(0);
       if(marital=='M' || marital=='U' );
       {
    	   System.out.println("Enter The Gender Male/Female: ");
    	   char gender=in.next().charAt(0);
    	   System.out.println("Enter The Age : ");
    	   int age=in.nextInt();
    	   if((gender=='M' || gender=='m')&& age>=30)
    	   {
    		   System.out.println("You are Eligible For Insurance");
    	   }
    	   else if ((gender=='F' || gender=='f')&& age>=25)
    	   {
    		   System.out.println("You are eligible for insurance");
    	   }
    	   else {
    		   System.out.println("Invalid input");
    	   }
    	   }
       }

}

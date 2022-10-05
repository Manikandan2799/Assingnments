package zoho;

import java.util.Scanner;

public class Oddlengthstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value in odd...");
		String str=in.next();
		for(int i = 0; i < str.length(); i++)
	    {
	      for(int j = 0; j < str.length(); j++)
	      {  
	        if((i == j) || (i + j == str.length() - 1))
	          System.out.print(str.charAt(j)); 
	        else
	          System.out.print(" ");
	      }
	      System.out.println();

	}

}
}

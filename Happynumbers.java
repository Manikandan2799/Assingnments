package zoho;

import java.util.Scanner;

public class Happynumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF N");
		int n = in.nextInt();
		int temp=happynum(n);
		System.out.println(happynum(temp)==1 ? "it is a happy number" : "not a happy number" );

	}
	   static int happynum(int n) {
	   int a,c=0;
	   while(n!=0)
	   {
		   a=n%10;
		   c=c+a*a;
		   n/=10;
	   }
         return c;
}
}
package first;

import java.util.Scanner;

public class FindEvenOrAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			int rem = num%2;
			if (rem==0)
			{
				System.out.println("Even");
			}
			else if (rem==1)
			{
				System.out.println("Odd");
			}
			}
		

	}

}

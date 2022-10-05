package zoho;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = in.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n+ "*"+ i +" ="+n*i);
				
			}
			for (int i = 1; i <=10; i++) {
				System.out.print(i+"-"+n+"=");
				System.out.println(i-n);

}
		}

}


	}



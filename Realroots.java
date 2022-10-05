package zoho;

import java.util.Scanner;

public class Realroots {

	public static void main(String[] args) {
		System.out.println("Enter the value of a: ");
		try (Scanner in = new Scanner(System.in)) {
			double a = in.nextDouble();
			System.out.println("Enter the value of b: ");
			double b = in.nextDouble();
			System.out.println("Enter the value of c: ");
			Double c = in.nextDouble();
			Double d = b * b - 4.0 * a * c;
			if (d > 0.0) {
				double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
				double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
				System.out.println("The roots are " + r1 + " and " + r2);
			} else if (d == 0.0) {
				double r1 = -b / (2.0 * a);
				System.out.println("The root is " + r1);
			} else {
				System.out.println("Roots are not real.");


}
		}

}
}
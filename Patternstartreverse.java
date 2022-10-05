package zoho;

public class Patternstartreverse {

	public static void main(String[] args) {
		int rows = 8;
		int m = 1;
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= m; j++) {
					System.out.print(" ");
			}
			for (int k = 1; k <=(i-1); k++) {
				System.out.print(" *");
				
			}
			m++;
			System.out.println();
		}

	}

}

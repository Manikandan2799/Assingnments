package zoho;

public class Alphabetpattern {

	public static void main(String[] args) {
		char ch = 'E';
		if (ch >= 'A') {
			for (int i = ch-64; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {

					System.out.printf("%c",'A'-1+i);
				}
				System.out.println();

	}

		}
	}
}

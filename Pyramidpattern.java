package zoho;

public class Pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=3;
		int number=1;
		for (int i = 0; i <=input; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();

	}

}
}

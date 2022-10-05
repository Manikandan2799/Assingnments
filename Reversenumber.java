package zoho;

public class Reversenumber {

	public static void main(String[] args) {
		int num =12345, tempNum=num,rev=0,rem=0;
		int ans =0;
		while(tempNum!=0){
			rem=tempNum%10;
			rev=(rev*10)+rem;
			tempNum=tempNum/10;
		}
		System.out.println(rev);
		ans= num-rev;
		System.out.println(ans);

	}

}

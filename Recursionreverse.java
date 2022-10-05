package zoho;

public class Recursionreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love India";
		System.out.println(s);
		String[] sArray = s.split(" ");
		
		String output = "";
		
		for (int i = sArray.length-1; i >=0 ; i--) {
			
			output+=sArray[i];
			output+=" ";
			
		}
		System.out.println(output);

	}

}

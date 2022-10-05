package zoho2;

import java.util.Scanner;

public class Pronicnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = in.nextInt();
        int ans = 0;
    
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }


	}



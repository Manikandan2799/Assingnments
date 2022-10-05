package zoho;

import java.util.Arrays;

public class Sorttheelements {

	public static void main(String[] args) {
		int a[] = {13,2,4,15,12,10,5};         // Input:  13,2 4,15,12,10,5
	       int m=a.length/2;                     // Output: 13,2,12,10,5,15,4
	       int r1[]=new int[m+1];               //Eg 2:  Input: 1,2,3,4,5,6,7,8,9
	       int r2[]=new int[a.length-(m+1)];     // Output: 9,2,7,4,5,6,3,8,1
	       int j=0,k=0;
	      for(int i=0;i<a.length;i++)
	      {
	      if(i%2==0)
	      {
	      r1[j++]=a[i];
	      }
	      else
	      {
	      r2[k++]=a[i];
	      }
	      }
	      System.out.println(Arrays.toString(r1));
	      System.out.println(Arrays.toString(r2));
	      for(int i=0;i<r1.length;i++)
	      {  
	      for( j=i+1;j<r1.length;j++)
	      {
	      if(r1[j]>r1[i])
	      {
	     int temp=r1[j];
	      r1[j]=r1[i];
	      r1[i]=temp;
	      }
	      }  
	      }
	      System.out.println(Arrays.toString(r1));
	      for(int i=0;i<r2.length;i++)
	      {  
	      for( j=i+1;j<r2.length;j++)
	      {
	      if(r2[j]<r2[i])
	      {
	     int temp=r2[j];
	      r2[j]=r2[i];
	      r2[i]=temp;
	      }
	      }  
	      }
	      System.out.println(Arrays.toString(r2));
	      j=0;k=1;
	      for(int i=0;i<=m;i++)
	      {
	      if(i<m)
	      {
	     a[j]=r1[i];
	     a[k]=r2[i];
	     j+=2;
	     k+=2;
	      }
	      else
	      {
	      a[j]=r1[i];
	      }
	      }
	      System.out.println(Arrays.toString(a));

	}

}

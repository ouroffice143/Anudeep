package js;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	      int x=s.nextInt();	
		  int [] intArray = new int[x];
			  System.out.println("Enter Values");
			  for(int i=0;i<intArray.length;i++)
			  {
			  intArray[i]=s.nextInt();
		  }
		 for(int i=intArray.length-1;i>=0;i--)
		 {
		   System.out.println(intArray[i]);
		   
		 }

	}

}

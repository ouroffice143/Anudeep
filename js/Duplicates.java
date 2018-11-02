package js;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	      int x=s.nextInt();	
	      int count=0;
		  int [] intArray = new int[x];
		  int [] a = new int[x];
			  System.out.println("Enter Values");
			  for(int i=0;i<intArray.length;i++)
			  {
				  intArray[i]=s.nextInt();
				 
			  }
			  for(int i=0;i<intArray.length;i++)
			  {  count=0;
				  for (int j = i+1; j < intArray.length; j++)
		            {
		                if ((intArray[i] == intArray[j]))
		                {count++;
		                    System.out.println("Duplicate Element : "+intArray[i]);  
		                    
		                }		                
		          
				  if(count>0)
				  System.out.println(intArray[i]+" is repeated "+count+" times");
					  }
	}  }
}

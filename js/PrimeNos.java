package js;

public class PrimeNos {

	public static void main(String[] args) {
		int i=1;
		while(i<=100)
		{
		if(i==2|i==3|i==5|i==7|i==11)
		{
		System.out.println("prime"+i);	
		}
		else if(i%2==0 | i%3==0 | i%5==0 | i%7==0 | i%11==0)
		{
		System.out.println("not a prime" +i);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		}
		else
		{
		System.out.println("prime"+i);
		}
		i++;
		}
	}

}

package newpackage;
import java.util.*;

public class Factorial {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int no;
		no = s.nextInt();
		int fact=no;
		if(no==1 || no==0)
		{
			System.out.println("factorial of 0 , 1 is 1");
		}
		else {
			    
	    for(int j = (no-1); j>=1; j--)
	    {
	    	fact = fact*j;
	    }
	    
	    System.out.println(fact);
	}
	}

}

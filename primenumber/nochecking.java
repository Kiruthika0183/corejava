package primenumber;
import java.util.Scanner;
public class nochecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number :");
	    n=num.nextInt();
		/*for (i=2;i<n;i++)
		{
			if(n%i==0)
			break;
		}*/
	    
		i=2;
		while(i<n)
		{
			if(n%i==0)
			break;
			i++;
		}
		
		if(i==n)
		System.out.println("Prime");
		else
		System.out.println("Composite");
		

		}
		
	}


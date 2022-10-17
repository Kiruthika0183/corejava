package factorial;
import java.util.Scanner;
public class Factnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number" );
		int num;
	    num=obj.nextInt();
	    int i=1,fact=1;
	    while(i<=num)
	    {
	    	fact=fact*i;
	    	i++;
	    }
	    System.out.println("Factorial is "+fact);
	    
	    
	    
		
		
		
		

	}

}

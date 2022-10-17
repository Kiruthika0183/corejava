package EvenorOdd;
import java.util.Scanner;

public class nochecking {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a no :");
		        int num=reader.nextInt();	
		if (num%2==0)
		{
			System.out.println("The entered number is Even");
		}
		else
		{
			System.out.println("The entered number is Odd");
			
		}
		

	}

}

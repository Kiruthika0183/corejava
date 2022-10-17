package SumofEveno;
import java.util.Scanner;
public class SumofEveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,N,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(i=2;i<N;i+=2)
		
			System.out.println("Sum of EvenNo is :" +sum);
			sum+=i;
			
	
		}
		

	}


package avgarray;

public class average {

	public static void main(String[] args) {
		int[] num= new int[6];
		
		num[0]=2;
		num[1]=6;
		num[2]=4;
		num[3]=3;
		num[4]=1;
		num[5]=8;
		
		double avg=0.0;
		int sum=0;
		//find the sum of these numbers
		for(int i=0;i<6;i++)
		sum=sum+num[i];
		avg=(double)sum/6;
		System.out.println("The sum of six number is :" +sum);
		System.out.println("The average of six number is :" +avg);
		
		
		
			
		}
		

	}



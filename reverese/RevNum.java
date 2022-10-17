package reverese;

public class RevNum {
	int r;
	long REVNUM(long n,long res)
	{
		if(n==0)
			return res;
		else
		{
			r=(int)n%10;
			res=res*10+r;
			n=n/10;
			return REVNUM(n,res);
			
		}
		
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long r=0;
		RevNum obj=new RevNum();
		System.out.println("Reverse number :" +obj.REVNUM(6789,r));
		
		

	}

}

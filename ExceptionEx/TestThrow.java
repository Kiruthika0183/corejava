package ExceptionEx;

public class TestThrow {
	public static void checkNum(int num)
	{
		if(num<1)
		{
		  throw new ArithmeticException("\nNumber is negative");
		  
		}
		else
		{
			System.out.println("square of:"+num+"is"+(num*num));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrow obj=new TestThrow();
		obj.checkNum(-4);
		System.out.println("rest of the code");

		
		
		
		
		
	}

}

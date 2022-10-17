package ExceptionEx;

public class TestThrowAndThrows {
	//defining the user defined method which throws arithmetic exception
	static void method() throws ArithmeticException
	{
		System.out.println("Inside the method");
		throw new ArithmeticException("throwing arithmetic exception");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught in main() method");
		
		}
	
	
	
	
	
	}

}

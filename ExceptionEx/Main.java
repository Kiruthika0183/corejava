package ExceptionEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int array[]= {1,3,6,7};
			System.out.println(array[10]);
		
		}
		catch(Exception e)
		{
			System.out.println("Somthing went wrong...");
		
		}
		finally
		{
			System.out.println("The 'try' and 'catch' finished");
			
		}

	}

}

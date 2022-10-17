package ExceptionEx;

public class Hellow {
	static void  age(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException("Access denied age must be above 18 to watch movie");
	}
	else
	{
		System.out.println("Access granted to watch movie");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(24);

		
		
	}

}

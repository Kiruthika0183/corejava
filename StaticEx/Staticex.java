package StaticEx;

public class Staticex {
	//static variable
	static int a=67;
	//instance variable
	int b=90;
	void SimpleDisplay()
	{
		System.out.println(a);
		System.out.println(b);
	}
	//static method
	static void StaticDisplay()
	{
		System.out.println("Static method ..." +a);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticex obj=new Staticex();
		obj.SimpleDisplay();
		//calling static method
		StaticDisplay(); //don't need an object and we can use classname.methodname()
	
	
		
				

	}

}

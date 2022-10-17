package HybrdInherWorld;

class HumanBody{
	public void displayHuman()
	{
		System.out.println("method defined in the HumanBody class");
		
	}
} 
interface Male 
{
	public void show();
	
}
interface Female 
{
	public void show();
	
}

public class child extends HumanBody implements Male,Female{
	public void show()
	{
		System.out.println("Implementations of the show() method defines in the interface Male and Female");
	}
	public void DisplayHuman()
	{
		System.out.println("Method defined in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		System.out.println("Implementation of Hybrid Inheriatnce in Java");
		c.show();
		c.DisplayHuman();

		
		
		
		
		
	}

}

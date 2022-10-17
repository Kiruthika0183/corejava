package oops;
//abstract class
abstract class Animal
{
	//abstract method
	public abstract void animalsound();
	//normal method
	public void sleep()
	{
	System.out.println("ZZZzzz");
	}
}
//subclass inherit from Animal
class pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pig says : wee wee ");
		
	}
}

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pig p=new pig();	
		p.animalsound();
		p.sleep();

	}

}

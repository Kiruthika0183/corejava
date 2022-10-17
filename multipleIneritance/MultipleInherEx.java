package multipleIneritance;
class Animal implements AnimalEx
{
	public void eat()
	{
		System.out.println("animal is eating");
		
	}
	public void travel()
	{
		System.out.println("animal is travelling");
	}

}

public class MultipleInherEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.travel();

	}

}

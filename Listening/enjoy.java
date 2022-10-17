package Listening;
//abstract class
abstract class Bird{
	abstract void makesound();
	
}

// subclasses of Bird
class Parrot extends Bird
{
	public void makesound()
	{
		System.out.println(" Parrot : kee kee");
		
	}
}

class Sparrow extends Bird
{
	public void makesound()
	{
		System.out.println(" Sparrow : koo koo");
	}	
	
}


public class enjoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating instance of abstract class
		Parrot p=new Parrot(); /*we don't use public class name and abstract name
		(coz we used an abstract keyword it can't be constructed class (overridden)*/
		Sparrow s=new Sparrow();
		p.makesound();
		s.makesound();
		

	}

}

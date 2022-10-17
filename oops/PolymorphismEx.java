package oops;

class Polygon
{
	//method to render a shape
	public void render()
	{
		System.out.println("Rendering Polygon...");
		
	}
}
class Square extends Polygon
{
	//render square
	public void render()
	{
		System.out.println("Rendering Square...");
		
	}
}
class Circle extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Circle...");
		
	}
}

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dynamic binding
		Square s=new Square();
		s.render();
		Circle c=new Circle();
		c.render();
		//static binding
		Polygon p=new Polygon();
		p.render();	
		
	}

}

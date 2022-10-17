package oops;
class Area 
{
	//fields to calculate area
	int length;
	int breadth;
	//constructor to initialize the value
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}

public void getArea()
{
	int area=length*breadth;
	System.out.println("Area : "+area);
	
}}

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Area rectangle=new Area(45,30);
	rectangle.getArea();
	

	}

}

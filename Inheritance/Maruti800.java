package Inheritance;

//parent class
class car
{
	public car()
	{
		System.out.println("class: car");
	}
	public void VehicleType()
	{
		System.out.println("VechicleType: car");
		
	}
}

//child class
 class Maruti extends car
{
	public Maruti()
	{
		System.out.println("class : Maruti");
		
	}
	public void brand()
	{
		System.out.println("Brand : Maruti");
	}
	public void speed()
	{
		System.out.println("Speed : 90kmph");
	}
}

public class Maruti800 extends Maruti {
	public Maruti800()
	{
		System.out.println("class : Maruti800");
		
	}
		public void speed()
	{
		System.out.println("Speed : 80kmph");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maruti800 obj=new Maruti800();
		obj.VehicleType();
		obj.brand();
		obj.speed();
		
		
		
		
		
	}

}

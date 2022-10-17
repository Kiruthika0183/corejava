package multipleIneritance;

class Band implements KPOP
{
	public void BTS()
	{
		System.out.println("Ultimate");
	}
	public void EXO()
	{
		System.out.println("Emerging");
	}
	public void KPOP()
	{
		System.out.println("Star Group");	
	}

}

public class MultipleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band c=new Band();
		c.BTS();
		c.EXO();
		c.KPOP();

		
		
		
		
		
		
	}

}

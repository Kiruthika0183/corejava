package Thread;



class Thread1 extends Thread
{
	public void run()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("The Thread1 will be .." +i);
	}
}}
class Thread2 extends Thread
{
	public void run()
	{
		for(int j=6;j<10;j++)
		{
			System.out.println("The Thread1 will be .. "+j);
		}
	
	}
}

public class Mainthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 m1=new Thread1();
		m1.run();
		
		Thread2 m2=new Thread2();
		m2.run();
		

	}
	}



		
	



package Thread;
class RunnableThread implements Runnable
{
	public void run()
	{
		System.out.println("Implementing the runnable Interface,thread statrted running..");
	}
}
class ExtendingThread extends Thread
{
	public void run()
	{
		System.out.println("Extending thead class,thread started running ...");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
		t2.start();
		ExtendingThread t3=new ExtendingThread();
		t3.start();
		

	}
	

}

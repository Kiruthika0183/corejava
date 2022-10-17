package whool;

public class Whool {
	void sum(int a,double b)
	{
		System.out.println(a+b);
	}
    void sum(double b,int a)
    {
    	System.out.println(a+b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whool obj=new Whool();
		obj.sum(5, 60.0);
		obj.sum(70.0,3);

	}

}

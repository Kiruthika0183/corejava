package oops;

public class OverLoadingEx {
void sum(int a,int b)
{
	System.out.println(a+b);
	
}
  void sum(int a,int b,int c)
{
	System.out.println(a+b+c);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingEx obj=new OverLoadingEx();
		obj.sum(40,30);
		obj.sum(90,10,30);
		
		
	}

}

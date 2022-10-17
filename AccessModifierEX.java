class Parentclass
{
	int a=2;
	public int b=3;
	protected int c=4;
	private int d=5;
	void showdata() {
		
	System.out.println("Inside ParentClass");
	System.out.println("a= " +a);
	System.out.println("b= " +b);
	System.out.println("c= " +c);
	System.out.println("d= " +d);
	}
}
class Childclass extends Parentclass{
	void accessdata(){
	System.out.println("Inside Childclass");
	System.out.println("a= " +a);
	System.out.println("b= " +b);
	System.out.println("c= " +c);
	//System.out.println("d= " +d);//private member can't be accessed
	}
	
	
}

public class AccessModifierEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.showdata();
		obj.accessdata();

	}

}

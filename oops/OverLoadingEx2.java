package oops;

public class OverLoadingEx2 {
	
	void main()
	{
		System.out.println("void Main");
		
	}
	int main(int a,int b)
	{
		System.out.println("Int Main");
		return a+b;
		
	}
  String main(String a,String b)
	{
		System.out.println("String Main");
		return a.concat(b);
		
	}
  int main(int a,int b,int c)
	{
		System.out.println("Int Main");
		return a*b*c;
	}
  
	float main(float a ,float b,float c)
	{
		System.out.println("float Main");
		return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingEx2 obj=new OverLoadingEx2();
		obj.main();
		System.out.println(obj.main(2,3));
		System.out.println(obj.main("java","coding"));
		System.out.println(obj.main(3,4,2));
		System.out.println(obj.main(4.0f,9.0f,1.0f));
		
		
		
		
		
	}

}

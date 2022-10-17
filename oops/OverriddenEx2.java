package oops;
//parent class
class attendence
{
void display()

{
	System.out.println("hemi is present");
	
}}
//child class

public class OverriddenEx2  extends attendence {
	void display()
	{
      System.out.println("hemi is absent");
	}

 public static void main(String[] args) {
		// TODO Auto-generated method stub
     OverriddenEx2 obj=new OverriddenEx2(); // creating object
     obj.display(); //calling method
		
		
	}

}

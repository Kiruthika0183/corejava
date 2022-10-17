package ConstructorEx;

public class ParameterizedEx1{
	String StudentName;
	int StudentAge;
	//constructor
	 ParameterizedEx1(String name,int age)
	 {
		 StudentName= name;
		 StudentAge= age;
		 age=21;
	 }
   void display() {
	System.out.println(StudentName+""+StudentAge);
	}
   public static void main(String[]args) {
	   ParameterizedEx1 myobj=new ParameterizedEx1("Kookie", 25);
	   myobj.display();
   }
}

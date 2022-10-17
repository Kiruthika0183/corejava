package ConstructorEx;

public class SuperMethod extends SuperClass{
public SuperMethod(){
super("java");


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperMethod superMethod=new SuperMethod();

	}

}
class SuperClass
{
	SuperClass(String name){
		System.out.println("This contructor received nameargument"+name);
		
	}
}
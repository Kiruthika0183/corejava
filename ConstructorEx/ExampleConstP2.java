package ConstructorEx;

public class ExampleConstP2{
	ExampleConstP2(int i,int j){
		System.out.println("parameterized constructor");
		
	}
	ExampleConstP2(int i,int j,int k){
		System.out.println("Parameterized Constructor1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleConstP2 obj=new ExampleConstP2(5,6,7);
	
		
	}

}

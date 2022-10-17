package StringEx;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";                // str is a reference variable
		String str1=new String("Java");   // str1 is an object/instance of a class     
		
		String str2=new String("JAVA");
	
		//by using == or equals()
		
		if(str==str1)        //it checks only locations
			System.out.println("both values are equal");
		else
			System.out.println("both values are not equal");
		
		
		if(str.equals(str1))     // it checks values
			System.out.println("both values are equal");
		else
			System.out.println("both values are not equal");
			
			
		}

	}



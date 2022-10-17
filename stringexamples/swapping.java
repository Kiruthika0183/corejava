package stringexamples;

public class swapping {
	
	int x,z;
	 
	void swap(swapping s)
	{
		int a;
		a=s.x;
		s.x=s.z;
		s.z=a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapping obj=new swapping();
		
		obj.x=80;
		obj.z=45;
	   
		System.out.println( "Before swapping  \n");
	    System.out.println("X: "+obj.x);
	    System.out.println("Z: "+obj.z);
	    
	    obj.swap(obj);
	   
	    System.out.println( "After swapping  \n");
	    System.out.println("X: "+obj.x);
	    System.out.println("Z: "+obj.z);
	    
	    
	    
	   
		 
		

	}

}


public class FinalizeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		FinalizeEx2 str2 = new FinalizeEx2();
		  str2 = null;
		       
		        System.gc();
		        System.out.println("output of main method");

		    }
		    
		    protected void finalize()
		    {
		        System.out.println("output of finalize method");
		    }
		


	}


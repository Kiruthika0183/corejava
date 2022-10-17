import java.io.IOException;

public class FinalEx {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			int a=6,b=0,c;
			c=a/b;
			System.out.println("result:"+c);

			}
			catch(Exception e){
			System.out.println(e);
			}
			finally{
			System.out.println("Final block");
			}


	}

}

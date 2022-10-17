package StringEx;

public class comparestrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "testing";
		String str2= "TEST";
		
		int h=str1.compareToIgnoreCase(str2);
		
		if (h==0)
		{
			System.out.println("equals");
			
		}
		else if(h>0)
		{
			System.out.println("string 1 is greater");
		}
		else
		{
			System.out.println("string 2 is greater");
		}
		
		System.out.println(h==0?"Equals":(h>0?"String1":"String2"));
			
	}

}

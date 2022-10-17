package stringexamples;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string declaration without using new operator
		String a="jung";
		System.out.println("String a=" +a);
		
		//string declaration with new operator
		
		String b=new String("kook");
		System.out.println("String b=" +b);
		// some string methods
		System.out.println("The length of the string is :" +a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println("Character at position 3:" +a.charAt(3));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("j"));
		
				

	}

}

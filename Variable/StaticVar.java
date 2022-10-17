package Variable;
class Student
{
	public static double fees;
	public static String name="kiruthika";
	
}

public class StaticVar {

	public static void main(String[] args) {
		Student.fees=90080;
		System.out.println(Student.name +" fees:"+Student.fees);

	}

}

package controlflow;
import java.util.Scanner; 
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pie=3.14f;
		float rad,a,c;
		int ch;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Main menu");
		System.out.println("1: Area of circle");
		System.out.println("2 : Circumference of circle");
		System.out.println("Exit");
		
		System.out.println("Enter your choice [1-3]: ");
		ch=obj.nextInt();
		
		System.out.println("Enter radius: ");
		rad=obj.nextInt();
		
		switch(ch)
		{
		case 1:
			a=pie*rad*rad;
			System.out.println("Area : " +a);
			break;
			
		case 2:
			c=2*pie*rad;
			System.out.println("Circumference : " +c);
			break;
		
		case 3:
			System.exit(0);
			break;
				
		default:
			System.out.println("Invalid chioce");
			break;
			
		}
			

	}

}

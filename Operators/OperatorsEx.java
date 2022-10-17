package Operators;

public class OperatorsEx {

	public static void main(String[] args) {
		// assignment operator
		
		int num1,num2;
		num1=20;
		System.out.println(num1);
		num2=num1;
		System.out.println(num2);
		
		//arithmetic operator
		//addition
		int output=num1+num2;
		System.out.println("num1+num2:"+output);
		//subtraction
		int output1=num1-num2;
		System.out.println("num1-num2:"+output1);
		//multiplication
		int output2=num1*num2;
		System.out.println("num1*num2:"+output2);
		//Division
		int output3=num1/num2;
		System.out.println("num1/num2:"+output3);
		//Modulus
		int output4=num1%num2;
		System.out.println("num1%num2:"+output4);
		
		//Unary operator
		double number=10;
		boolean flag=false;
		System.out.println("+number="+ +number); //+10
		System.out.println("-number="+ -number); //-10
		System.out.println("+number="+ ++number); //now 10+1=11
		System.out.println("+number="+ --number); //11-1=10
		System.out.println("!flag="+ !flag); //invert value (false)
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
		System.out.println(number);
		
		//Relational operator
		if(num1>num2)
		{
			System.out.println("num1 is greater");
			
		}
		if(num1<num2)
		{
			System.out.println("num2 is greater");
		
		}
		if(num1==num2)
		{
			System.out.println("num1 is equal to num2");
			
		}
			
		//logical operator
		int num3=30;
		boolean result2;
		result2=(num1>num2)&&(num3>num1);
		System.out.println(result2);
		result2=(num1>num2)||(num3>num1);
		System.out.println(result2);
		
		//Ternary operators
		int februaryDays=29;
		String display;
		display=(februaryDays==28)?"Not a leap year":"leap year";
		System.out.println(display);
		
		//bitwise operator
		int a=50;  //50= 0011 0010
		int b=20;  //20= 0001 0100
		int c=0;
		c=a&b;     //    0001 0000 = 16
		System.out.println("a&b=" +c);
		c=a|b;     //    0011 0110 = 54
		System.out.println("a|b=" +c);
		c=a^b;     //    0010 0110 = 38
		System.out.println("a^b=" +c);
		c=~b;   
		System.out.println("~b=" +c);
		
		//shift operators
		c=a>>2;
		System.out.println("a>>2=" +c); //0000 1100 =12
		c=a<<2;
		System.out.println("a<<2=" +c); // 1100 1000 =200
		
		
	}

}

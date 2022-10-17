package datacollections;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk=new Stack<String>();
		stk.push("avinash");
		stk.push("kavin");
		stk.push("bala");
		stk.push("harini");
		System.out.println("Initial list : " +stk);
		stk.pop();
		System.out.println("After pop() The list : " +stk);
		stk.peek();
		System.out.println("Element at top of the list : " +stk);
		stk.isEmpty();
		System.out.println("check stack empty? " +stk.isEmpty());
		int stk1=stk.search("kavin");
		System.out.println("The position of kavin is : " +stk1);
		
		

	}

}

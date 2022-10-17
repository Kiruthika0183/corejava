import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new  ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		ArrayList l=new  ArrayList();
		l.add(5);
		l.add(9);
		System.out.println("list elements=" +list);
		System.out.println("list elements =" +l);
		System.out.println("size of list =" +list.size());
		System.out.println("size of list =" +l.size());
		System.out.println("Get value from list =" +list.get(0));
		System.out.println("Set value into list =" +list.set(0,"kiruthika"));
		System.out.println("list elements=" +list);
		System.out.println("Get value from list =" +l.get(1));
		System.out.println("Set value into list =" +l.set(0,8));
		System.out.println("list elements=" +l);
		System.out.println("remove element from list =" +list.remove(0));
		System.out.println("remove element from list =" +l.remove(0));

	}

}

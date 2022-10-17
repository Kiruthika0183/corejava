package datacollections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("john");
		ll.add("david");
		ll.add("jung");
		ll.add("kookie");
		ll.add("kim");
		System.out.println("Initial list elements : "+ll);
		ll.remove(0);
		System.out.println("After removing[0] method : "+ll);
		ll.remove("david");
		System.out.println("After removing(object) method : "+ll);
		
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("hari");
		ll2.add("naveen");
		ll.addAll(ll2);
		System.out.println("Updated List : "+ll);
		
		Iterator<String> i=ll.descendingIterator();
		while((i).hasNext()){
			System.out.println(i.next());
		}
		
		
		
		ll.removeAll(ll2);
		System.out.println("After removeAll() method: "+ll);
		ll.removeFirst();
		System.out.println("After removeFirst() method: "+ll);
		ll.removeLast();
		System.out.println("After removeLast() method: "+ll);
		ll.clear();
		System.out.println("After clear() method: "+ll);
		
		
		
		

	}

}

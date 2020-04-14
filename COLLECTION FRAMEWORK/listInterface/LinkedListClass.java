package listInterface;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListClass {

	public static void main(String[] args) {
//Non Synchronized class
		LinkedList ll = new LinkedList();
		ll.add("Shiv");
		ll.add('A');
		ll.add(10);
		ll.add(12.3);
		ll.add(true);
		ll.add(200);
		System.out.println("LinkedList Stored elements: Before removal "+ll);
		ll.remove(2);
		System.out.println("LinkedList Stored elements: After removal"+ll);
		ll.add(2,'Z');
		ll.add(null);
		System.out.println("LinkedList Stored elements: After index and null Add"+ll);
		//Collection is being used to hold and transfer data from one location to another location.
		//all collection interface implements Cloneable and Serializable interface.
		System.out.println(ll instanceof Serializable);//Since Collection is being used for object transfer from one location to another location.
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof RandomAccess);// since LinkedList doesn't allows random access of elements--> false
		ll.removeAll(ll);
		System.out.println("LinkedList Stored elements: Afer removal of All elements"+ll);
	}
}
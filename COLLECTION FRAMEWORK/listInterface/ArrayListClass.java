package listInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListClass {

	public static void main(String[] args) {
//Non Synchronized class
		ArrayList al = new ArrayList();
		al.add("Shiv");
		al.add('A');
		al.add(10);
		al.add(12.3);
		al.add(true);
		al.add(200);
		System.out.println("ArrayList Stored elements: Before removal: "+al);
		al.remove(2);
		System.out.println("ArrayList Stored elements: After removal: "+al);
		al.add(2,'Z');
		al.add(null);
		System.out.println("ArrayList Stored elements: After index and null Add: "+al);
		//Collection is being used to hold and transfer data from one location to another location.
		//all collection interface implements Cloneable and Serializable interface.
		System.out.println(al instanceof Serializable);//Since Collection is being used for object transfer from one location to another location.
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);// since ArrayList allows random access of elements--> true
		al.removeAll(al);
		System.out.println("ArrayList Stored elements: Afer removal of All elements"+al);
	}
}
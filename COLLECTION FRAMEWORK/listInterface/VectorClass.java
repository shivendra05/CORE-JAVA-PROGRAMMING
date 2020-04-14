package listInterface;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
//Synchronized class
		Vector v = new Vector();
		v.add("Shiv");
		v.add('A');
		v.add(10);
		v.add(12.3);
		v.add(true);
		v.add(200);
		System.out.println("Vector Stored elements: Before Removal: "+v);
		v.remove(2);
		System.out.println("Vector Stored elements: After Removal: "+v);
		v.add(2,'Z');
		v.add(null);
		System.out.println("Vector Stored elements: After index and null Add: "+v);
		//Collection is being used to hold and transfer data from one location to another location.
		//all collection interface implements Cloneable and Serializable interface.
		System.out.println(v instanceof Serializable);//Since Collection is being used for object transfer from one location to another location.
		System.out.println(v instanceof Cloneable);
		System.out.println(v instanceof RandomAccess);// since LinkedList doesn't allows random access of elements--> false
		v.removeAll(v);
		System.out.println("Vector Stored elements: Afer removal of All elements"+v);
	}
}
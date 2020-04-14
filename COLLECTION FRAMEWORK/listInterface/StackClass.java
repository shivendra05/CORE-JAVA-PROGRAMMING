package listInterface;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;

public class StackClass {

	public static void main(String[] args) {
//child/subclass of Vector
//Synchronized class
		Stack s = new Stack();
		s.push("Shiv");
		s.push('A');
		s.push(10);
		s.push(12.3);
		s.push(true);
		s.push(200);
		System.out.println("Stack Stored elements: Before Removal: "+s);
		s.pop();
		System.out.println("Stack Stored elements: After Removal: "+s);
		s.add('Z');
		s.push(null);
		Object first = s.peek();
		Boolean status = s.isEmpty();
		System.out.println("Stack First/Top element: Peek(): "+first);
		System.out.println("Stack stored element status: isEmpty: "+status);
		Object random = s.get(3);
		System.out.println("Stack random element retrival: "+random);
		System.out.println("Stack Stored elements: After null Add: "+s);
		//Collection is being used to hold and transfer data from one location to another location.
		//all collection interface implements Cloneable and Serializable interface.
		System.out.println(s instanceof Serializable);//Since Collection is being used for object transfer from one location to another location.
		System.out.println(s instanceof Cloneable);
		System.out.println(s instanceof RandomAccess);// since LinkedList doesn't allows random access of elements--> false
		s.removeAll(s);
		System.out.println("Vector Stored elements: Afer removal of All elements"+s);
	}
}
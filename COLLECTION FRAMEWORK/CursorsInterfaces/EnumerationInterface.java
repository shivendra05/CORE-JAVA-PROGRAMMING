package CursorsInterfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationInterface {

	public static void main(String[] args) {
		//Enumeration can only be use for legacy class----vector/stack 
		Vector v = new Vector();
		v.add("Shiv");
		v.add('A');
		v.add(10);
		v.add(12.3);
		v.add(true);
		v.add(200);
		v.add(2,'Z');
		v.add(null);
		Enumeration num = v.elements();
		System.out.println("------------------------");
		while(num.hasMoreElements()) {
			System.out.println(num.nextElement());
		}
		
		System.out.println("--------Vector-With Iterator----------------");
		Iterator itr =v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
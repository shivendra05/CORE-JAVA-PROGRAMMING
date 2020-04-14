package CursorsInterfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorInterfac {

	public static void main(String[] args) {
	//Iterator Interface Interface
	//Iterator can move only forward direction
		
		ArrayList al = new ArrayList();
		al.add("Shiv");
		al.add('A');
		al.add(10);
		al.add(12.3);
		al.add(true);
		al.add(200);
		al.remove(2);
		al.add(2,'Z');
		al.add(null);
		System.out.println("--------ListIterator-With hasNext()----------------");
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------ArrayList Works with forward---ListIterator-With hasNexxt()---------------");
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("-------ArrayList Works with previouse---ListIterator-With hasPrevious()---------------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
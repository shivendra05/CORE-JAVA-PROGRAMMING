package CursorsInterfaces;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorInterfac2 {

	public static void main(String[] args) {
//ListIterator Interface is child of Iterator interface
		//ListInterface can move bi- direction...either forwards or backwards
		LinkedList ll = new LinkedList();
		ll.add("Shiv");
		ll.add('A');
		ll.add(10);
		ll.add(12.3);
		ll.add(true);
		ll.add(200);
		ll.remove(2);
		ll.add(2,'Z');
		ll.add(null);
		System.out.println("--------ListIterator-With hasNext()----------------");
		Iterator itr =ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------ArrayList Works with forward---ListIterator-With hasNexxt()---------------");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("-------ArrayList Works with previouse---ListIterator-With hasPrevious()---------------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
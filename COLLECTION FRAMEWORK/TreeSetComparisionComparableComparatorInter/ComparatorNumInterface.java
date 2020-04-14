package TreeSetComparisionComparableComparatorInter;

import java.util.TreeSet;

public class ComparatorNumInterface {

	public static void main(String[] args) {
		//Default Natural sorting done by comparable
		//'A'<'B'--> +1, 'A'>'B'--> -1, 'A'<'A'--> 0--Ascending Order
		//If it is a number...Ascending order.
		TreeSet ts = new TreeSet(new ComparatorNumInterfaceImpl());
		ts.add(20);
		ts.add(2);
		ts.add(100);
		ts.add(500);
		ts.add(40);
		System.out.println("Elements: "+ts);
		//To change sorting order....We have to do for Comparator 
	}
}
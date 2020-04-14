package TreeSetComparisionComparableComparatorInter;

import java.util.TreeSet;

public class ComparableInterface {

	public static void main(String[] args) {
//Default Natural sorting done by comparable
//'A'<'B'--> +1, 'A'>'B'--> -1, 'A'<'A'--> 0--Ascending Order
		//If it is a number...Ascending order.
		TreeSet ts = new TreeSet();
		ts.add("K");
		ts.add("R");
		ts.add("H");
		ts.add("L");
		ts.add("B");
		System.out.println("Elements: "+ts);
		
		//To change sorting order....We have to do for Comparator 
	}
}
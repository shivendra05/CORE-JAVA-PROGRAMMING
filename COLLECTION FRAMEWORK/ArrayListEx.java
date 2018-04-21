import java.util.*;
class  ArrayListEx{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(10);
		System.out.println("Size of ArrayList: "+al.size());
		System.out.println("ArrayList is Empty(): "+al.isEmpty());
		System.out.println("Elements on ArrayList BeforeSort: "+al);
		Collections.sort(al);
		System.out.println("Elements on ArrayList AfterSort: "+al);
		ArrayList al1 = new ArrayList(){{
			add(200);
			add(500);
			add(400);
			add(300);
			add(100);
		}};
		System.out.println("Elements on ArrayList BeforeSort: "+al1);
		Collections.sort(al1);
		System.out.println("Elements on ArrayList AfterSort: "+al1);
		Iterator itr = al.iterator();
		int sum=0;
		while(itr.hasNext()){
			Object obj = itr.next();
			Integer in = (Integer)obj;
			int v = in.intValue();
			sum = sum+v;
		}
		System.out.println("Sum of ArrayList 1: "+sum);
		int alsum=0;
		Iterator itr1 = al1.iterator();
		while(itr1.hasNext()){
			Object obj = itr1.next();
			Integer in = (Integer)obj;
			int v = in.intValue();
			alsum = alsum+v;
		}
		System.out.println("Sum of ArrayList 1: "+alsum);
	}
}

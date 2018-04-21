import java.util.*;
class  TreeSetEx{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		System.out.println("TreeSet Before Insert");  
		System.out.println("Size of ArrayList: "+ts.size());
		System.out.println("ArrayList is Empty(): "+ts.isEmpty());
		System.out.println("Elements on TreeSet : "+ts);
		ts.add(20);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(10);
		System.out.println("TreeSet Before Insert"); 
		System.out.println("Size of ArrayList: "+ts.size());
		System.out.println("ArrayList is Empty(): "+ts.isEmpty());
		System.out.println("Elements on TreeSet : "+ts);
		Iterator itr  =  ts.iterator();
		int sum=0,asum=0;
		while(itr.hasNext()){
			Object o= itr.next();
			Integer in = (Integer)o;
			int v = in.intValue();
			System.out.println(v);
			sum = sum+v;
		}
		System.out.println("TreeSet Elements Sum Using Iterator: "+sum);
		Object []obj = ts.toArray();
		for(Object o:obj){
			Integer in = (Integer)o;
			int v = in.intValue();
			System.out.println(v);
			asum = asum+v;
		}
		System.out.println("TreeSet Elements Sum Using toArray: "+asum);
	}
}

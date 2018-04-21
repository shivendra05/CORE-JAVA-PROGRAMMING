import java.util.*;
class LinkedListEx{
	void LLOperations(){
	LinkedList ll =new LinkedList();
	System.out.println("Elements in LinkedList: "+ll);
	System.out.println("Size of LinkedList: "+ll.size());
	System.out.println("Is LinkedList Empty: "+ll.isEmpty());
	ll.add(10);
	ll.add(30);
	ll.add(50);
	ll.add(40);
	ll.add(20);
	System.out.println("Elements in LinkedList: "+ll);
	System.out.println("Size of LinkedList: "+ll.size());
	System.out.println("Is LinkedList Empty: "+ll.isEmpty());
	ll.add(0,5);
	System.out.println("===========Printing Elements of LinkedList by Iterator");
	System.out.println("Elements in LinkedList: "+ll);
	System.out.println("Size of LinkedList: "+ll.size());
	Iterator itr = ll.iterator();
	int sum=0;
	while(itr.hasNext()){
		Object obj = itr.next();;
		Integer in = (Integer)obj;
		int v = in.intValue();
		sum=sum+v;
	}
	System.out.println("Sum of Elements in Linked list: "+sum);

	System.out.println("===========Printing Elements of LinkedList by ListIterator");
	ListIterator litr = ll.listIterator();
	int lsum=0,rsum=0;
	while(litr.hasNext()){
		Object obj = litr.next();;
		Integer in = (Integer)obj;
		int v = in.intValue();
		lsum=lsum+v;
	}
	System.out.println("Sum of Elements in Linked list from Fist to Last: "+lsum);
	while(litr.hasPrevious()){
		Object obj = litr.previous();;
		Integer in = (Integer)obj;
		int v = in.intValue();
		rsum=rsum+v;
	}
	System.out.println("Sum of Elements in Linked list from Last to First: "+rsum);
	System.out.println("===========Printing Elements of LinkedList by toArray");
	Object []aobj = ll.toArray();
	/*while(aobj.lenght!=null){
		Object obj = litr.previous();;
		Integer in = Integer.parseInt(obj);
		int v = in.ValueOf();
		rsum=rsum+v;
	}*/
	int asum=0;
	for(Object o:aobj){
		//Object obj = litr.previous();;
		Integer in = (Integer)o;
		//Integer in = Integer.parseInt(o);
		int v = in.intValue();
		asum=asum+v;
	}
	System.out.println("Sum of Elements in Linked list from Last to First: "+asum);
	System.out.println("===========Printing Elements of LinkedList by get()");
	System.out.println(ll.get(0));
	System.out.println(ll.get(1));
	}
}
class  LinkedListExMain{
	public static void main(String[] args){
		System.out.println("============DEMO ON LINKEDLIST===============");
		LinkedListEx llx = new LinkedListEx();
		llx.LLOperations();
	}
}
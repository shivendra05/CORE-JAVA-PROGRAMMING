import java.util.*;
class VectorEx{
	public static void main(String[] args){
		System.out.println("============ Demo on Lagecy Collectoion Framework Vector ===============");
		
		Vector v = new Vector();
		System.out.println("Size of Vector is:  "+v.size());
		System.out.println("Size of Vector is:  "+v.capacity());
		v.addElement(100);
		v.addElement(50);
		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.addElement(80);
		System.out.println("Size of Vector is:  "+v.size());
		System.out.println("Size of Vector is:  "+v.capacity());
		//v.addElement(2,60);
		//v.addElement(3,80);

		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			Object obj = en.nextElement();
			System.out.println(obj);
			Class c = obj.getClass();
			String cname = c.getName();
		}
	}
}
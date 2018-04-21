import java.util.*;
class HashTableEx{
	public static void main(String[] args){
		System.out.println("==========Hashtable Example");
		Hashtable ht = new Hashtable();
		ht.put("AP","Vig");
		ht.put("HP","Simla");
		ht.put("MP","Bhopal");
		ht.put("UP","Kanpur");
		ht.put("Goa","Panjo");
		ht.put("Maharastra","Mum");
		ht.put("Telngana","Hyderabad");

		System.out.println("HashTable Data is: "+ht);
		Set s = ht.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry obj = (Map.Entry)itr.next();
			Object kobj = obj.getKey();
			Object vobj = obj.getValue();
			System.out.println("State Name is: "+kobj +"\t \t"+" Capital: "+vobj);
		}
	}
}

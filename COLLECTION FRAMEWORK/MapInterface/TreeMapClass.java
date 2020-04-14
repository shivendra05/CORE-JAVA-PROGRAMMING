package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
		TreeMap hm = new TreeMap();
		hm.put("Shiv",20);
		hm.put("Pandey",30);
		hm.put("Shivam",40);
		hm.put("Divya",30);
		hm.put("Dhivya",30);
		hm.put("Shivaya",20);
		System.out.println(hm);
		System.out.println("--------With keySet() and get()");
		Set values = hm.keySet();
		Iterator itr = values.iterator();
		while(itr.hasNext()) {
			Object keyObj =itr.next();
			Object valueObj = hm.get(keyObj);
			System.out.println(keyObj+":--:"+valueObj);
		}
		
		System.out.println("--------With entrySet() and getKey()-getValue()");
		
		Set values1 = hm.entrySet();
		Iterator itr1 = values1.iterator();
		while(itr1.hasNext()) {
			Map.Entry kvValues = (Map.Entry)itr1.next();
			Object key = kvValues.getKey();
			Object value = kvValues.getValue();
			System.out.println(key+"--"+value);
			
		}
		
		System.out.println("--------With keySet() and get()");
		
		Set values2 = hm.keySet();
		Iterator itr2 = values2.iterator();
		while(itr2.hasNext()) {
			Object key = itr2.next();
			Object value = hm.get(key);
			System.out.println(key+"--"+value);
			
		}
	}
}
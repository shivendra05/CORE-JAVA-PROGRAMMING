package com.practice.collectionFramework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface2 {

	/*LinkedHashMap:: it is a child class of a HashMap, its exactly same as HashMap (including methods and Constructor)
	 *
	 *		HashMap 				                               vs 					LinkedHashMap
	 *--------------------------------------------------------------------------------------------------
	 *	HashTable										                              HashTable+LinkedList
	 *	insertion order not preserved					    	      insertion order preserved
	 *
	 *
	 *LinkedHashSet and LinkedHashMap used for cache based application.
	 *
	 *  == vs .equals()
	 *   == is used for reference comparison where as .equals() meant for content comparison
	 *   
	 *   Integer i1= new Integer(10);
	 *   Integer i2= new Integer(10);
	 *   
	 *   Sysout(i1==i2)//false 
	 *   Sysout(i1.equals(i2))//true
	 *    
	 *    IdentityHashMap::- its exactly same as HashMap(including Method and constructor) except below reason
	 *    in the case of normal hashMap JVM will use .equals() to identify duplicate keys which is meant for content comparison
	 *    where as IdentityHashMap uses == to identity duplicate keys, which is meant for reference/address comparison.
	 */
	public static void main(String[] args) {
	
		LinkedHashMap<String, Integer> lHmap = new LinkedHashMap<String, Integer>();
		System.out.println(lHmap.put("A",1)); //--return null, Since no Duplicate
		System.out.println(lHmap.put("B",2));;//--return null, Since no Duplicate
		System.out.println(lHmap.put("C",3));;//--return null, Since no Duplicate
		System.out.println(lHmap.put("D",4));;//--return null, Since no Duplicate
		System.out.println(lHmap.put(null,null));;//--return null, Since no Duplicate
		System.out.println(lHmap.put("A",5));;//--return 1, Since there is Duplicate
		System.out.println("HashSet:: "+lHmap);
		System.out.println("HashSet:: "+lHmap.keySet());
		System.out.println("HashSet:: "+lHmap.values());

		System.out.println("Using KeySet Methods********");
		
		Set set=lHmap.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
	    
	    System.out.println("HashMap vs IdentiyHashMap");
	    System.out.println("******************HashMap*************");
	    HashMap<String, Integer> HashMap = new HashMap<String, Integer>();

		System.out.println(HashMap.put("A",1)); //--return null, Since no Duplicate
		System.out.println(HashMap.put("A",2));;//--return 1, Since there is Duplicate
	    Set hmmap = HashMap.keySet();
	    Iterator hmitr = hmmap.iterator();
	    
	    while(hmitr.hasNext()) {
	    	Object keyValue =hmitr.next();
	    	Object valueValue =HashMap.get(keyValue);
	    	System.out.println(keyValue+" "+valueValue);
	    }
	    
	    System.out.println("******************IdentityHashMap*************");
	    IdentityHashMap identityHashMap = new IdentityHashMap();

		System.out.println(identityHashMap.put("A",1)); //--return null, Since no Duplicate
		System.out.println(identityHashMap.put("A",2));;//--return 1, Since there is Duplicate
		System.out.println(identityHashMap);
	    Set identitySet = HashMap.entrySet();
	    Iterator intityItr = identitySet.iterator();
	    
	    while(intityItr.hasNext()) {
	    	Map.Entry mapValue =(Map.Entry)intityItr.next();
	    	Object keyValue =mapValue.getKey();
	    	Object valueValue =mapValue.getValue();
	    	System.out.println(keyValue+" "+valueValue);
	    }
	}
}
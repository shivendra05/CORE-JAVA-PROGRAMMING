package com.practice.collectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Map_Interface {
	/*
	 *Map --> Map is not child interface of Collection(I). if we want to represent a group of object as a key value pairs.
	 *		then we should for map.
	 *			both keys and values are object only, duplicate keys are not allowed, but values can be duplicated.
	 *
	 * 	each key-value pair is called entry hence Map is considered as a collection of entry object.
	 * 
	 * Map(I) methods...
	 * 	Object put(Object key, Object value) --> to add one key-value pair to the Map, if the key is already present then
	 * 										old value will be replace with new value and returns old value.
	 *	
	 *	putAll(Map m)
	 *	get(Object key)
	 *	remove(Object key)
	 *	containsValue(Object key)
	 *	isEmpty()
	 *	size()
	 * 
	 * 
	 * key value --> entry
	 * 
	 * 1. Set keySet();
	 * 2. Collection values();
	 * 3. Set entrySet()
	 * 
	 * interface Map{
	 * 	interface Entry{
	 * 		getKey();
	 * 		getValue();
	 * 		setValue(Object obj);
	 * 	}
	 * }
	 *		Underlying DS isHashTable, insertion isnt preserved and it is based on hashCode keys, where duplicate keys arent allowed but values are allowed.
	 * 		Heterogeneous object is allowed for both key and value, null is allowed for key but only once.
	 *		HashMap implements Serializable, Cloneable interface but not RandomAccess Interface 		
	 */
	public static void main(String[] args) {

		HashMap hmap = new HashMap();
		System.out.println(hmap.put("A",1)); //--return null, Since no Duplicate
		System.out.println(hmap.put("B",2));;//--return null, Since no Duplicate
		System.out.println(hmap.put("C",3));;//--return null, Since no Duplicate
		System.out.println(hmap.put("D",4));;//--return null, Since no Duplicate
		System.out.println(hmap.put(null,null));;//--return null, Since no Duplicate
		System.out.println(hmap.put("A",5));;//--return 1, Since there is Duplicate

		System.out.println("HashSet:: "+hmap);
		System.out.println("HashSet:: "+hmap.keySet());
		System.out.println("HashSet:: "+hmap.values());

		System.out.println("Using KeySet Methods********");

		Set  hMapKeySet= hmap.keySet();
		Iterator itr = hMapKeySet.iterator();
		while (itr.hasNext()) {
			Object objKey =itr.next();
			Object objValue =hmap.get(objKey);
			System.out.println(objKey+" "+objValue);
		}

		System.out.println("Using Map.Entry Methods********");

		Set  hMapKeySet1= hmap.entrySet();
		Iterator itr1 = hMapKeySet1.iterator();

		while (itr1.hasNext()) {
			Map.Entry mapValues=(Map.Entry)itr1.next();
			System.out.println(mapValues.getKey()+" "+mapValues.getValue());
		}
		
		/* 					HashMap 						vs 								HashTable
		 * 	-------------------------------------------------------------------------------------------------------
		 * 			Non Synchronized														Synchronized
		 * 			Not Thread Safe															Thread Safe	
		 * 			Performance is High													Performance is Low
		 * 			Null is allowed for both key-values							Null not allowed
		 * 			not a legacy															        legacy
		 */
	}
}
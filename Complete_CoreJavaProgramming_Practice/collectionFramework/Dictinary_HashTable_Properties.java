package com.practice.collectionFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Dictinary_HashTable_Properties {
	/*HashTable:: DS used is hashtable, insertion order isnt preserved and it is based on keys. duplicate keys arent allowed but values can be.
	 *				Heterogeneous/Null values are not allowed for both key and values.
	 *
	 * it implements serializable and cloneable but not RandomAccess. every Methods present in Hashtable is synchronized and Hence HashTable object is Thread safe
	 * HashTable is best choice if frequent operation is search operation. 
	 * 
	 *Properties ::- the main advantage of this, if there is change in properties file to reflect that change
	 *					just re-deployment is enough, which wont create any business impact to the client.
	 *
	 *we can use java properties object which are coming from properties file.
	 *	in normal Map, HashMap/HashTable/TreeMap key-value can be any type, but in case of Properties, Key-value should be String Type.
	 *
	 *Properties p = new Properties();
	 *
	 *methods in Properties class..
	 *String getProperty(String str);
	 *String setProperty(String key, String Value) --duplicate not allowed. if so, returns old and update new values
	 *Enumeration propertyNames();
	 *
	 *p.load(file) --> to load all the property from property file to java Property Object.
	 *p.stor() --> to store all the property from java Property Object to property file.
	 */
	public static void main(String[] args) throws IOException {

		HashMap hmap = new HashMap();
		System.out.println(hmap.put("A",1)); //--return null, Since no Duplicate
		System.out.println(hmap.put("B",2));;//--return null, Since no Duplicate
		System.out.println(hmap.put("C",3));;//--return null, Since no Duplicate
		System.out.println(hmap.put("D",4));;//--return null, Since no Duplicate
		System.out.println(hmap.put(null,null));;//--return null, Since no Duplicate
		System.out.println(hmap.put("A",5));;//--return 2, Since there is Duplicate

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
		
		System.out.println("--------Properties--------");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("propFiles1.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		
		prop.setProperty("password","shiv123");
		prop.setProperty("add","Rewa");
		prop.setProperty("CellNo","8328");
		FileOutputStream fos= new FileOutputStream("propFiles1.properties");
		prop.store(fos, "Password Added");
		
		/* 					HashMap 						vs 								HashTable
		 * 	------------------------------------------------------------------------------------------------
		 * 			Non Synchronized														Synchronized
		 * 			Not Thread Safe															Thread Safe	
		 * 			Performance is High													Performance is Low
		 * 			Null is allowed for both key-values							Null not allowed
		 * 			not a legacy															         legacy
		 */
	}
}
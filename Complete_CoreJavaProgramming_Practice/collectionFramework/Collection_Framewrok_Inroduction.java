package com.practice.collectionFramework;

public class Collection_Framewrok_Inroduction {

/*			Arrays			        	                                        vs 		                 			Collections
 * ----------------------------------------------------------------------------------------------------------------------------------------
 * Arrays are of fixed size								                        Collections are growable  in nature
 * wrt memory arrays arent recommended to use		     	wrt memory collections are recommended to use
 * wrt performance arrays are recommended to use		     wrt performance collections arent recommended to use
 * Arrays can hold Homogeneous elements                         can hold both Homogeneous and Heterogeneous
 * can insert Primitive and Object						                    can insert only	Object.
 */

	/* Collection::
	 * if we want to represent a group of individual object as a single entity then 
	 * we should go for collection.
	 * 
	 *  Collection Framework :: it contains several classes and interfaces which can be used to represent a group 
	 *  						individual object as a single entity.
	 */
	
	/* usually we use collection to hold and transfer objects from one location to another location(container),
	 * to provide support for this requirement every collection class implements serializable and Cloneble interface.
	 */
	
	/* 9 key interfaces in Collection Framework.
	 * 
	 * 1.Collection	2.List	     3.Set		           4.SortedSet		     5.NavigableSet
	 * 6.Queue		    7.Map	     8.SortedMap	   9.NavigableMap
	 */
	
	/* 1.Collection(I) --> if we want to represent group of individual object as a single entity then we go for collection.
	 * 		collection(I), defines most common method which are applicable for any collection object.
	 * 		in general Collection(I) considered as root interface of a Collection Framework
	 */
	
	/*			Collection			        	                                      vs 					Collections
	 * -------------------------------------------------------------------------------------------------------------------------------------------------
	 * it is an interface									                                  it is a class, defines utility methods
	 * (Contains common method for child interfaces 		(have utility methods Collections.sort(),Collections.addAll(), SycnchronizedList(List))
	 * classes)
	 */
	
	/* 2.List(I) --> is child interface of collection, if we want to represent group of individual object as a single 
	 * 		entity, where duplicates are allowed and insertion order is preserved then we go for List.
	 * Implementation classes of List(I)-- > ArrayList, LinkedList, Vector(legacy class jdk1.0), Stack(legacy class jdk1.0)
	 */
	
	/* 3.Set(I) --> is child interface of collection, if we want to represent group of individual object as a single 
	 * 		entity, where duplicates arent allowed and insertion order is not required then we go for Set.
	 * Implementation classes of Set(I)-- > HashSet, LinkedHashSet
	 */
	
	/* 4.SortedSet(I) --> is child interface of collection, if we want to represent group of individual object as a single 
	 * 		entity, where duplicates arent allowed and all Object should be inserted according to some sorting order.
	 */

	/* 5.NavigableSet(I) --> is child interface of SortedSet(I), contains several methods for navigation purpose. 
	 * 			Implementation classes of NavigableSet(I)-- > TreeSet, 
	 */
	
	/*			List				        	                         vs 					Set
	 * --------------------------------------------------------------------------------------------------------
	 * Duplicates are allowed						         			Duplicates arent allowed
	 * insertion order preserved					        			insertion order arent preserved	
	 */

	/*6.Queue(I) --> is child interface of Collection(I), If we want to represent group of individual objects prior to processing then we should go 
	 * 				for Queue, it follows FIFO but based on our requirement we can implement our own priority order.
	 * 
	 * ex. Queue is used to store mailId store.
	 *  Implementation classes of Queue(I)-- > PriorityQueue, BlockingQueue, PriorityBlockingQueue, LinkedBlockingQueue.
	 */
	
	/*if we want to represent object as a key-value pair then we should got for below interface.
	 * 7.Map(I) --> Map is not a child interface of Collection(I), If we want to represent group of individual objects as Key-value Pairs 
	 * 				then we should go for Map(I). Both key and Value are objects are only. 
	 * 				Duplicate Keys arent allowed but values can be Duplicated
	 * 	Implementation classes of Map(I)-- > HashMap, LinkedHashMap, Dictionary, Hashtable, Properties 
	 */	
	
	/* if we want to represent object as a key-value pair then we should got for below interface.
	 * 8.SortedMap(I) --> Map is a child interface of Map(I), If we want to represent group of individual objects as Key-value Pairs
	 * 				according to some sorting order of keys then we should go for it. In sorted Map the sorting should be
	 * 				based on key not Based on Value
	 * 	Implementation classes of SortedMap(I)-- > NavigableMap(I) it defines several methods for navigation purpose.
	 */	
}
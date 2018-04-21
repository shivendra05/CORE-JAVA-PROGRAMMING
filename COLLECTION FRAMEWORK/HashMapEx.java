import java.util.*;
class HashMapEx{
	public static void main(String[] args) {
		System.out.println("========== HashMap Example ======");
		HashMap hm = new HashMap();
		hm.put(1,12);
		hm.put(4,42);
		hm.put(3,32);
		hm.put(2,32);
		hm.put(7,72);
		hm.put(6,62);
		System.out.println("========== get(2) Elements on HashMap ======");
		System.out.println(hm.get(2));
		hm.remove(3);
		Set key = hm.keySet();
		System.out.println("HashMap Keys are: ======\n"+key);
		System.out.println("========== Access HashMap  Elements through Iterator======");
		Iterator itr = key.iterator();
		while(itr.hasNext()){
			Object o = itr.next();
			Object v = hm.get(o);
			Integer kValue = (Integer)o;
			Integer vValue = (Integer)v;
			int kin = kValue.intValue();
			int vin = vValue.intValue();
			System.out.print(" Key:  "+kin);
			System.out.println(" Value:  "+vin);
		}

		Set keys = hm.entrySet();;
		System.out.println("HashMap Keys Using entrySet are: ======\n"+keys);
		System.out.println("========== Access HashMap  Elements through Iterator======");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()){
			Object o = itr1.next();
			Map.Entry es = (Map.Entry)o;

			Object kValue = es.getKey();
			Object vValue = es.getValue();

			Integer inkValue = (Integer)kValue;
			Integer invValue = (Integer)vValue;
			
			int iinkValue = inkValue.intValue();
			int iinvValue = invValue.intValue();

			System.out.print(" Key:  "+iinkValue);
			System.out.println(" Value:  "+iinvValue);
		}
	}
}
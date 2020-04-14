package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapWithComprator {
	public static void main(String []args) {
		TreeMap ts = new TreeMap(new TreeMapWithCompratorImpl());
		ts.put("AA",100);
		ts.put("XXX",10);
		ts.put("AAA",12);
		ts.put("ABC",102);
		ts.put("CCC",330);
		System.out.println("-----keySet()---");
		Set values = ts.keySet();
		Iterator itr = values.iterator();
		while(itr.hasNext()) {
			Object key =itr.next();
			Object value = ts.get(key);
			System.out.println(key+"--"+value);
		}
		System.out.println("------entrySet()---");
		Set evalues = ts.entrySet();
		Iterator itr1 =  evalues.iterator();
		while(itr1.hasNext()) {
			Map.Entry allValues = (Map.Entry) itr1.next();
			Object key = allValues.getKey();
			Object val = allValues.getValue();
			System.out.println(key+"---"+val);
		}
	}
}
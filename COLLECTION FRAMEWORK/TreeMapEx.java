import java.util.*;
class  TreeMapEx{
	public static  void main(String []k){
		TreeMap ts = new TreeMap();
		ts.put(6,600);
		ts.put(5,500);
		ts.put(3,300);
		ts.put(1,100);
		ts.put(2,200);
		ts.put(4,400);
		System.out.println("========== get(2) Elements on HashMap ======");
		System.out.println(ts.get(2));
		ts.remove(3);
		Set key = ts.keySet();
		System.out.println("HashMap Keys are: ======\n"+key);
		System.out.println("========== Access HashMap  Elements through Iterator======");
		Iterator itr = key.iterator();
		while(itr.hasNext()){
			Object kobj = itr.next();
			Object vobj = ts.get(kobj);
			Integer kin = (Integer)kobj;
			Integer vin = (Integer)vobj;
			int kValue = kin.intValue();
			int vValue = vin.intValue();
			System.out.println(" Key "+key +"   "+" Value "+vValue);
		}

		Set sets = ts.entrySet();
		Iterator sitr = sets.iterator();
		System.out.println("========== Access HashMap  Elements through EntrySets======");
		while(sitr.hasNext()){
			Object obj = sitr.next();
			Map.Entry mObj = (Map.Entry)obj;
			Object kObj = mObj.getKey();
			Object vObj = mObj.getValue();
			Integer kValue = (Integer)kObj;
			Integer vValue = (Integer)vObj;
			int knValue = kValue.intValue();
			int vnValue = vValue.intValue();
			System.out.println(" Key "+knValue +"   "+" Value "+vnValue);
		}
	}
}
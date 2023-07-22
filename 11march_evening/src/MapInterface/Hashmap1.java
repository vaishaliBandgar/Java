package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap1 {
	public static void main(String[] args) {
		
		HashMap<Integer , String> HM =new HashMap<Integer , String>();
		HashMap HM1 = new HashMap();
		HM.put(101, "John");  //pair
		HM.put(107, "David");
		HM.put(108, "Josef");
		HM.put(111, "Pawan");
		HM.put(161, "Sam");
		HM.put(103, "Sam");
		
		System.out.println(HM);
		System.out.println(HM.get(108));//josef
		
		System.out.println(HM.containsKey(101));  //JOHN
		System.out.println(HM.containsKey(111));   //PAWAN
		
		System.out.println(HM.containsValue("Sam"));
		System.out.println(HM.containsValue("Sam1"));
		
		
		System.out.println(HM.isEmpty());
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		
		for(Object obj :HM.keySet()) {
			System.out.println(obj);
		}
		for(Object obj :HM.values()) {
			System.out.println(obj);
		}
		
		for(Object obj1 :HM.keySet()) {
			System.out.println(obj1 +"   "+ HM.get(obj1));
		}
		
		//Entry Method
		
		System.out.println("***************");
		for(Map.Entry entry:HM.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("****************");
		
		//Itretor
		
		Set S =HM.entrySet();
		Iterator it =S.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry =(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}

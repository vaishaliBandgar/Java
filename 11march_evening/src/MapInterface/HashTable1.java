package MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {
	public static void main(String[] args) {
		
		Hashtable<Integer , String> HT =new Hashtable<>();//default size 17 .LF-0.75
		
		//insert the element
	
		HT.put(101, "John");  //JAVA.LANG nULL POINTEReXCEPTION
		HT.put(107, "David");
		HT.put(108, "Josef");
		HT.put(111, "Pawan");
		HT.put(161, "Ram"); 
		HT.put(103, "Sam");
		//HT.put(102, null);//HT does nt contain null value AND KEY
		
		
		System.out.println(HT);
		
		
		System.out.println(HT.remove(108));//josef
		System.out.println(HT);
		
		System.out.println(HT.containsKey(101));  //JOHN
		System.out.println(HT.containsKey(111));   //PAWAN
		
		System.out.println(HT.containsValue("Sam"));
		System.out.println(HT.containsValue("SARA"));
		
		
		System.out.println(HT.isEmpty());
	
		
		System.out.println(HT.keySet());
		System.out.println(HT.values());
		
		for(Object obj :HT.keySet()) {
			System.out.println(obj+" "+HT.get(obj));
		}
		
	}	
	

}

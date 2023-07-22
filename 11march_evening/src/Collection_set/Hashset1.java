package Collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	
	public static void main(String[] args) {
		
		HashSet HS = new HashSet(); //DC=16 Lf= 0.75//Hetro
		HashSet HS1 = new HashSet(200, (float)0.50);
	
	HashSet<String>HS2 = new HashSet<String>();// homo
	HS.add(23);
	HS.add('D');
	HS.add(13.5);
	HS.add("we");
	HS.add(true);
	HS.add(null); // null one time show in o/p
	HS.add(null);
	System.out.println(HS);
	
	System.out.println(HS.add('h')); //if the element not present then true 
	
	System.out.println(HS.add('D')); // if present then o/p false
	
	System.out.println(HS.size());
	
	// Remove
	
	HS.remove('D');
	System.out.println(HS);
	
	//set and get are not present in hashset
	
	System.out.println(HS.isEmpty());  //false
	System.out.println(HS1.isEmpty());   //true
	
	//contains
	
	System.out.println("***************");
	System.out.println(HS.contains('J'));
	
	
	//for(int i=0;i<HS.size();i++) {
	//	System.out.println(HS.get());
//	}
	
	System.out.println();
	for(Object obj:HS) {
		System.out.println(obj);
	}
	
	System.out.println();
	
	Iterator it = HS.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	}

}

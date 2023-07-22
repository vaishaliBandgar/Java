package Collection_set;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		
		HashSet HS2 = new HashSet(); // homo
		
		HS2.add(2);
		HS2.add(22);	
		HS2.add(23);
		HS2.add(26);
		HS2.add(28);
		HS2.add(30);
		
		
		
		HashSet HS3 = new HashSet(); 
		HS3.add(28);
		HS3.add(22);
		HS3.add(32);
		HS3.add(39);
		HS3.add(25);
		HS3.add(41);
		
	//	HS2.addAll(HS3); // only display unique element
		//System.out.println(HS2);
		
		//Retainall
	//	HS2.retainAll(HS3);  //only common elemnt display
		//System.out.println(HS2);
		
	//	System.out.println(HS2.containsAll(HS3)); //false
		HS2.removeAll(HS3);
		System.out.println(HS2);// common elemnt remove
	}

}

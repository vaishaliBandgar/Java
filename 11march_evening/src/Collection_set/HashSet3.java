package Collection_set;

import java.util.HashSet;

public class HashSet3 {
	
	public static void main(String[] args) {
		HashSet<String>HS2 = new HashSet<String>();//homo
		
		HS2.add("SAM");
		HS2.add("RAM");
		HS2.add("AMAN");
		HS2.add("JON");
		HS2.add("TEST");
		
		System.out.println(HS2);
		
		HashSet<String>HS3 = new HashSet<String>();
	    HS3.addAll(HS2)	;
	    System.out.println(HS3);
	    
	    
	    HS3.removeAll(HS2);
	    System.out.println(HS3);
	
	
	}

}

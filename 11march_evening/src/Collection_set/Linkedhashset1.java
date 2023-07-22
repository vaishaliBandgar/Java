package Collection_set;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet LHS = new LinkedHashSet();
		
		LinkedHashSet<Integer> LHS1 = new LinkedHashSet<Integer>();
		// same method are present which is present in hashset class
		//duplicate elemnt are not allowed
		//default capacity &LF =16 &0.75
		//insertion order is preserved
		
		LHS.add(200);
		LHS.add(2223);
		LHS.add('A');
		LHS.add("vaishali");
		LHS.add(null);
		LHS.add(null);
		
		System.out.println(LHS);
		
		System.out.println(LHS.add(200)); //FALSE
		System.out.println(LHS.add(400)); //TRUE
		System.out.println(LHS);
		
		
		
	}

}

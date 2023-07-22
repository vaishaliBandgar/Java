
package collectionlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		
		LinkedList<String> LL= new LinkedList<String>();
		LL.add("A");
		LL.add("U");
		LL.add("J");
		LL.add("K");
		LL.add("S");
		LL.add("O");
		System.out.println(LL);
		
		
		LinkedList<String> LL1= new LinkedList<String>();
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//removeall
		LL1.removeAll(LL);
		System.out.println(LL1);
		
		//collection
		System.out.println("Before sort");
		Collections.sort(LL);
		System.out.println(LL);
		
	    Collections.sort(LL, Collections.reverseOrder());
    	System.out.println(LL);
		
	}	

}

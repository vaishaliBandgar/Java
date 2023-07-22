package collectionlist;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector VC = new Vector();
		
		// insert the Element
		
		VC.add(46);
		VC.add("Test");
		VC.add('F');
		VC.add(true);
		VC.add(4);
		VC.add(6);
		
		System.out.println(VC);
		
		System.out.println(VC.size());
		
		//Remove
		VC.remove(5);
		System.out.println(VC);
		//System.out.println(VC.remove('F'));
		//VC.re
		//System.out.println(VC);
		
		//update
		
		VC.set(1, 44);
		System.out.println(VC);
		
		VC.add(3, "me");
		System.out.println(VC);
		
		System.out.println("Reading the element using For loop");
		for(int i=0;i<VC.size();i++) {
			System.out.println(VC.get(i));
		}
		
		System.out.println("Reading the element using For each loop");
		for(Object obj:VC) {
			System.out.println(obj);
		}
		System.out.println("Reading the element using Itrator loop");
		Iterator it =VC.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

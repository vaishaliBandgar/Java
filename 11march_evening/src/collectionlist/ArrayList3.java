package collectionlist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		String arr[]={"Dog","Cat","cow"};
		
	//	System.out.println(arr);
		for(String name:arr) {
			
			System.out.println(name);
		}
		
		//convert array into arralist
		
		ArrayList AL = new ArrayList(Arrays.asList(arr));//Arrays
		System.out.println(AL);
		
		
	}

	


}

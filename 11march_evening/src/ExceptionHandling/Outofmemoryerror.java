package ExceptionHandling;

import java.util.ArrayList;

public class Outofmemoryerror {
	public static void main(String[] args) {
		String str ="Rahul";
		
		ArrayList AL = new ArrayList();
		
		while(true) {
			str = str +"Test";
			AL.add(str);     //java.lang.OutOfMemoryError: Java heap space
			
		//	System.out.println(AL);
		}
	}

}

package Operators;

public class Logicaloperator {
	
	public static void main(String[] args) {
		
		boolean A= true;
		boolean B= true;
		
		System.out.println(A&&B);  //T
		System.out.println(A||B);  //T
		System.out.println();
		
		
		boolean A1= true;
		boolean B1= false;
		
		System.out.println(A1&&B1);  //f
		System.out.println(A1||B1);  //T
		System.out.println();
		
		
		boolean A2= false;
		boolean B2= true;
		
		System.out.println(A2&&B2);  //f
		System.out.println(A2||B2);  //t
		System.out.println();
		
		
		boolean A3= false;
		boolean B3= false;
		
		System.out.println(A3&&B3);  //F
		System.out.println(A3||B3);  //F
		System.out.println();
		
		
		
		
	}

}

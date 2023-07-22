package Abstraction;

public class CompleteClass {
	
	public static void main(String[] args) {
		
		CompleteClass cc = new CompleteClass();
		 
		cc.Test1();
		cc.Test1(10);
		
		
	}
	
	public void Test1() {   //method declaration
		
		System.out.println("Test Method");  //method Defination
		
	}
	 public void Test1(int i) {                // Method decl
		 
		 
		 System.out.println("Test Method"); //method def
		// System.out.println(i);
	 }

}

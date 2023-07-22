package Polymorphism;

public class StaticChild extends Static1 {
	
	public static void main(String[] args) {
		StaticChild SC = new StaticChild();
		 SC.Demo2();
	//	 SC.Demo1();
		 
	}
		
	
	
	public  void Demo2() {
		System.out.println(" child method Demo2");
	}
	
	public static void Demo1() {
		System.out.println("parent class static method: Demo5");  //method hiding
	}
}

package Polymorphism;

public class MethodOverloding {
	public static void main (String[] args) {
		
		MethodOverloding M1 = new MethodOverloding ();
		M1.Demo1("java");
		M1.Demo1();
		M1.Demo1(10);
		M1.Demo1(10, 20);
		M1.Demo1(10, 20, 33.3d);
		
		
	}
	public void Demo1() {
		System.out.println("NO argument method");
	}
	
	public void Demo1(int i) {
		System.out.println("one i/p argument method");
	}
	public void Demo1(String h) {
		System.out.println("String i/p argument method");
	} 
	
	public void Demo1(int i, int j) {
		System.out.println("two i/p argument method");
		
	}
	public void Demo1(int i, int j,double k) {
		
		System.out.println("three i/p argument method");
		
	}
	

}

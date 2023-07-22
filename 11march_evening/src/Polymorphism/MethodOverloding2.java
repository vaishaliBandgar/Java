package Polymorphism;

public class MethodOverloding2 {
	
	public static void main(String[] args) {
		
		MethodOverloding2 M0 = new MethodOverloding2();
		M0.addition(10, 20);
		M0.addition(10, "meera");
		
		MethodOverloding2.Demo1();
		MethodOverloding2.Demo1(10);
		
		
		
		
	}
	public void addition(int i, int j) {
		int sum= i+j;
		System.out.println(sum);
		
	}
	public void addition(int i,String j) {
		
		System.out.println("two i/p para method ");
	}
	public static void Demo1() {
		System.out.println("no argument static method");
		
	}
	public static void Demo1(int i) {
		System.out.println("one i/p para method ");
		
	}
	
	
	

}

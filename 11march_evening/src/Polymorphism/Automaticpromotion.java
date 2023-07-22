package Polymorphism;

public class Automaticpromotion {
	
	public static void main(String[] args) {
		
		Automaticpromotion M1 =new Automaticpromotion();
		M1.Test1('D');  //char i/p
		M1.Test1(10d);
		M1.Test1(33.5F);
		M1.Test1(333l);
		
	}
	
	public void Test1() {
		
		System.out.println("Zerp i/p para method");
	}
	
//public void Test1(int i) {
		
	//	System.out.println("Zerp i/p para method");
	//}
	
   public void Test1(double d) {
		
		System.out.println("double i/p para method");
	}
   public void Test1(float F) {
		
		System.out.println("float i/p para method");
	}
   public void Test1(long d) {
		
		System.out.println("long i/p para method");
	}


}

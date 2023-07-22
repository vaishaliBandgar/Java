package AccessModifiers;

public class public1 {
	
	public int No=100;
	
	public static void main(String[] args) {
		
		public1 P1 = new public1();
		
		P1.Demo1();
		P1.Demo2();
		
	}
	
	public void Demo1() {
		
		System.out.println("Public method");
	}
	
	public void Demo2() {
		
		System.out.println("Demo2 public Method");
		
	}

}

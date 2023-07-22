package ExceptionHandling;

public class Demo {
	
	public static void M1() {
	M2();
	}
	public static void M2() {
		M3();
		}
	public static void M3() {
		int Number =100;
		System.out.println(Number);
		}
	
	public static void main(String[] args) {
		M1();
		
		
	}
		

}

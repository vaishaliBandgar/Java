package Polymorphism;

public class Mainmethodoverloaded {
	
	public static void main(String[] args) {
		Mainmethodoverloaded MO =new Mainmethodoverloaded();
		MO.Demo1();
		MO.Demo2();
		
		int arr[] = {13};
		Mainmethodoverloaded.main(arr);
		Mainmethodoverloaded.main('A');
		
	}
	private static void main(char c) {
		// TODO Auto-generated method stub
		
	}
	public static void main(int[] args) {
		
		Mainmethodoverloaded MO =new Mainmethodoverloaded();
		MO.Demo1();
		MO.Demo2();
		
	}
	public static void main(char[] args) {
		Mainmethodoverloaded MO =new Mainmethodoverloaded ();
		MO.Demo1();
		MO.Demo2();
		
		
		
	}
	public void Demo1() {
		
		System.out.println("Demo1 method");
	}
	public void Demo2() {
		
		System.out.println("Demo2 method");
		
	}
	
	
	

}

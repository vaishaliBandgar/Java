package Methods;

public class Method4 {
	
	public static void main(String[] args) {
		
	System.out.println("Main method started");
	
	//Static reguler method calling from diff class
	
	//1.Direct calling
	//syntax --> Methodname()
	
	// Test1();
	// Test2();
	
	
     //2. calling by class name
	// syntax-- classname.methodename();
	
	Method3.Test1();
	Method3.Test2();
	Method4.Demo4();
	
	System.out.println("Main method Ended");
	}
	public static void Demo4() {
		System.out.println("Demo 4 method");
	}
	

}

package Methods;



public class Method1 { //class body
	
	//Static regular method calling from same class
	
	public static void main(String[] args) { //main method body
		
		 //starting point of program
		
		System.out.println("Main method started");
		
		//1.Direct calling
		
		//syntax --> Methodename();
		Demo1();
		Demo2();
		
	//2. calling by class name
		// syntax-- classname.methodename();
		
		Method1.Demo1();
		Method1.Demo2();
		
		System.out.println("Main method Ended");
	
		
	}
	public static void Demo1() {
		
		System.out.println("Static regular method calling from same class--> Demo1");
	}
	
	public static void Demo2() {
		
	System.out.println("Static regular method calling from same class--> Demo2");
	
	}

}

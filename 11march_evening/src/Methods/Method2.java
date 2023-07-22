package Methods;

public class Method2 {
	
	public static void main(String[]args) {
		
		System.out.println("Main method started");
		 // direct calling method
		
		staticmethod1();
		staticmethod2();
		
		
		//calling by classname
		
		Method2.staticmethod1();
		Method2.staticmethod2();
		
		
		System.out.println("Main method Endeded");
	}
	
	public static void staticmethod1() {
		
		int i = 20;
		int j = 30;
		int k = i+j;
		
		System.out.println("Addition of two no is-->" +k);
		
	}
	
	public static void staticmethod2() {
		
		System.out.println("static method calling from same class");
	}
	

}

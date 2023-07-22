package Methods;

public class Method5 {
	
	//Non-Static regular method calling from same class 
	public static void main(String[] args) {
		System.out.println("main method started");
		
		//1.Direct calling
		// Demo1();
		// Demo2();
		
		//2. calling classname
	//	Method5.Demo1();
    //  Method5.Demo2();
		 
		
		// object creation
		
		// syntax- classname refrencevariable =new classname();
		
		Method5 obj = new Method5();
		
		// objrefvarname.methodname();
		obj.Demo1();
		obj.Demo2();
		
		System.out.println("main method Ended");
		
		
		
	}
	
	public void Demo1() {
		System.out.println("Non-static regular method calling from same class--> Demo1" );
	}
	  public void Demo2() {
		  System.out.println("Non-static regular method calling from same class--> Demo2");
	  }
	  public void m1() {
		  System.out.println("hello");
	  }

}

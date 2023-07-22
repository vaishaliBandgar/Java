package Methods;
public class Method6 {
	
	

	//Non-Static regular method calling from same class 

		public static void main(String[] args) {
			
			
			System.out.println("main method Started");
		Method6 Test = new Method6();
		
		// we need to create first object of class
		//after creating the object copy of all the non static method will be store in 
	//    	the objectn
		
		Test.M1();
		Test.M2();
	//	Test.M3();

			System.out.println("main method ended");
		}
			
			
			//que
			// can i access static methods by using object refrences? --yes/no
			//ans--> yes we can access static method but it will through warning message
			//message--> the static method M3() from the type method6 should be accessed in static way
	
	
	public void M1() {
		System.out.println("Non-static regular method calling from same class--> M1" );
	}
	  public void M2() {
		  System.out.println("Non-static regular method calling from same class--> M2");
	  }
	  public static void M3() {
		  System.out.println("static method");
	  }

}

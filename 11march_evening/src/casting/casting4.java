package casting;

public class casting4 extends casting3 {
	
	public void Demo3() {
		
		System.out.println("Demo3--method");
	}
		public static void main(String[] args) {
			
			casting4 C4 = new casting4(); //static binding
			C4.Demo1();
			C4.Demo2();
		    C4.Demo3();
		    System.out.println(); 
		    
		    //upcasting
		    
		    casting3 C3 = new casting4(); //upcasting+top casting
		     C3.Demo1();
		     C3.Demo2();
		     
		     //Down casting
		     
		     casting4 C2= (casting4) new casting3();	//classcastexception
		     C2.Demo1();
		     C2.Demo2();
		     C2.Demo3();
		}


}

package Methods;

public class Method8 {
	
	public static void main(String[] args) {
		
		//Method7.M4();
	    //Method7.M5();
		
		Method7 obj = new Method7();
		obj.M4();
		obj.M5();
		
		Method8 obj1 = new Method8();
		obj1.M6();
		
		
		}
	 public void M6() {
		 System.out.println("Non-static regular method calling from same class ----M6");
	 }

}

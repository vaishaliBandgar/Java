package Constructor;

public class Rulesofconstructor {
	
	//1.  we can not create a constructor inside the method/function.
	// public Rulesofconstructor(){
	//}
	// 2. name of the constructor same as class name
	
  public	Rulesofconstructor(){
		
		System.out.println("hello");
	}
	
	//public void Rulesofconstructor() {  //3. we should not declared any return type for the constructor like void
		 
		//System.out.println("hello"); //4. if u declared void keyword  in constructor that time compiler will treated a method
	//} 4. Applicable modifier/ specifier - public, private, protected
	// not applicable mod/spec - static ,final, abstract , native
	
	public static void main(String[] args) {
		
		Rulesofconstructor RC = new Rulesofconstructor();
		// Rc. Rulesofconstructor();	
		}
}
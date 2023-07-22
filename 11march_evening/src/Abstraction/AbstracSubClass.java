package Abstraction;

public class AbstracSubClass extends AbstractClassConstructor  {
	
	public  AbstracSubClass() {
		super();
		
		System.out.println("subclass constructor");
		
		
	}
	
	public static void main(String[] args) {
		
		AbstracSubClass AS = new AbstracSubClass();
		
	//	AbstractClassConstructor acc = new AbstractClassConstructor();
		
		
		
		// o/p -sop("one i/p parameter constructor");
		
		       // sop("Abstract class constructor")
		//system.out.println("subclass constructor");
	}

}

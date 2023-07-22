package Abstraction;

public  abstract class AbstractClassConstructor {
	
	public AbstractClassConstructor() {
		this(300);
		System.out.println("Abstract class constructor");
		
	}
	
	private AbstractClassConstructor(int i) {
		
		System.out.println("one i/p parameter");
	}
	
	private AbstractClassConstructor(int i, int j) {
		
		System.out.println("Two i/p parameter");
	}

}

package Constructor;

public class Rule5 {
	
	//any number of constructor can be declared in java class but constructor name
	//should be same as class name but arguments/ parameter should be different
	
	public static void main(String[] args) {
		
		Rule5 R5 = new Rule5();
		Rule5 R6 = new Rule5(4);
		Rule5 R7 = new Rule5(1,2);
		Rule5 R8 = new Rule5(1,2,3);
		
		}
	
	public Rule5() {
		
		System.out.println("Zero input argument constructor");
		
	}
	public Rule5(int i) {
		System.out.println("One input argument constructor");
	}
	public Rule5(int i, int j) {
		
		System.out.println("Two input argument constructor");
	}
	public Rule5(int i, int j, int k) {
		System.out.println("Three input argument constructor");
	}
	

}

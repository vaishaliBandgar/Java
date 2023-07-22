package FinalFinallyFinalize;

public class Final1 {
	public static void main(String[] args) {
		
		//final is keyword and access modifier which is used to restriction
		//on variables ,methods keyword.
	//	1. final clas can not inherited to child class.
	//2.final method means we can not overriden by sub class.
	//	3.once we declared as a final variable we can not modified.
		
		
	
	
	int Number =100;
	System.out.println(Number);
	
	Number=200;
	System.out.println(Number);
	
	final int Number1=10;
	System.out.println(Number1);
	
	}
	public final void test()
	{
		System.out.println("Hello");
	}
	

}


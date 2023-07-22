package FinalFinallyFinalize;

public class Finally {
	
	public static void main(String[] args) {
		 Finally.Test();
		//finally is block in java exception handling to execute the important code
		//weather the exception is occures or not
		Finally.Div();
		
	}
	public static void Test() {
		
		try {
			System.out.println("try block");
		}catch(Exception e) {
			
			System.out.println("catch block");
		}finally {
			System.out.println("Finally block");
		}
	}
public static void Div() {
	//int k=i/0;
	try {
		int k=100/0;// Arithmetic exception
		System.out.println("Try block");
		}catch(ArithmeticException e) {
			System.out.println("Inside the catch block");
			System.out.println("Div by zero");
		}
	finally {
		System.out.println("Executed finally block");
	}
}
}

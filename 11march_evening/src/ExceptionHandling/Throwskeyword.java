package ExceptionHandling;

public class Throwskeyword {
	
	//Throws keyword used to declare the exception
	
	public static void main(String[] args) {
		
		Throwskeyword TK = new Throwskeyword();
		TK.Sum();
		System.out.println("hi");
		
		
	}
	public void Sum() {
		try {
			div();
		}
		catch(ArithmeticException e) {
			
		}
	}
		public void div() throws ArithmeticException,NullPointerException,IndexOutOfBoundsException{
			
			int i =10/0;//Exception
			int j=100/0;
		} 
	
	
	}



package ExceptionHandling;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		System.out.println("hi good morning");
		
		int Number=100;
		//System.out.println(Number/0); //1. java.lang.arithmatic exception
		
		System.out.println("hi good morning");
		String str ="mohit";
		
		//Integer.parseInt(str);  //2.java.lang.NumberformatException
		String Test = null;
		//System.out.println(Test.length());//3.java.lang.nullpointerException;
		
		int arr[]= new int[-5];//4.java.lang.NegativearraySizeException
		arr[0]=33;
		arr[5]=44;//5.java .lang.arrayIndexoutBoundException;
		
		//Exception handling= it is mechanism to handle runtime exception
	}

}

package TypeOfVariable;

public class LocalVariables_2 {
	
	public static void main(String[] args) {
		
		LocalVariables_2.Test1();
		LocalVariables_2.Test2();
		
		
	}
	
	public static void Test1() {
		
		int Number =200;  //Non static local variable
		
		System.out.println(Number);
		
		//system.out.println(Addition);
		
		}
	public static void Test2() {
		
		int i=10;
		int j=20;         //Non static local variables
		
		int Addition = i+j;
		System.out.println(Addition);
		
	}

}

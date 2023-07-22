package TypeOfVariable;

public class Static_Global_variables_1 {
	
	static int Number =300;  //static global variables
	
	public static void main(String[] args) {
		
		Static_Global_variables_1 sv = new Static_Global_variables_1();	
		
		sv.M1();
		sv.M2();
	    sv.name();
	    
	   sv. name1();
	}
	
	public void M1() {
		System.out.println(Number); //300
		
		Number = 400;
		
		System.out.println(Number); //400
	}
	public void M2() {
		System.out.println(Number); //400
		
		Number=500;
		
		System.out.println(Number); //500
	}
	public void name(){
		System.out.println(Number); //500
		
		}
	public static void name1() {
		
		System.out.println(Number);
		
	}
}

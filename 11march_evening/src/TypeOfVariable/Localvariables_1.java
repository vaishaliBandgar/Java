package TypeOfVariable;

public class Localvariables_1 {
	
	public static void main(String[] args) {
		
		Localvariables_1.m1();
		Localvariables_1.m2();
		
		
	}
	
	public static void m1() {
		
		int RollNo = 20;
		String Name = "Akash";
		
		//int static name1=30;--> we cannot declared static variables inside the main method
		//body or any kind of method of the class
		
		System.out.println(RollNo);
		System.out.println(Name);
		
	   // System.out.println(ABC);
		
	}
	
	public static void m2(){
		
		int Abc=30;
		System.out.println(Abc);
		
		}
	
}

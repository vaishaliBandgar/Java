package Constructor;

public class Defaultconstructor1 {
	
	String Name;
	int RollNo;
	
	public Defaultconstructor1() {
		
		System.out.println("Default constructor");
	}
	
	public static void main(String[] args) {
		
		Defaultconstructor1 D1 = new Defaultconstructor1();
		Defaultconstructor1 D2 = new Defaultconstructor1();
		Defaultconstructor1 D3 = new Defaultconstructor1();
		
		}
	public void Method1() {
		System.out.println("Default Method");
	}
	

}

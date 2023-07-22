package Constructor;

public class NeedOfconstructor {
	
	public NeedOfconstructor() {
		
		System.out.println("Default constructor");
		
	}
	String name; // non static glo variable // null
	int Rollno;   // 0
	// boolean- false
	
	public static void main(String[] args) {
		NeedOfconstructor S1 = new NeedOfconstructor();
		NeedOfconstructor S2 = new NeedOfconstructor();
		///
		
		NeedOfconstructor S100 = new NeedOfconstructor();
		
		
	}
	
	public void M1() {
		System.out.println(name+" "+Rollno);
	}
	 public void M2() {
		 
		 System.out.println(name+" "+Rollno);
	 }
	 
	// Purpose of constructor

}

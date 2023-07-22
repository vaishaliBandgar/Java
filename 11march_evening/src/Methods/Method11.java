package Methods;

public class Method11 {
	
	public static void main(String[] args) {
		Method11.Studentname("Rohit");
		Method11.Studentname("Rahul");
		Method11.Studentinfo("Tom",   11);
		Method11.Studentinfo("Ketan",  22);
		

	}
	
	public static void Studentname(String Name) {
		System.out.println(Name);
	}
	public static void Studentinfo(String Name,int No) {
		System.out.println("Student Info-->" +Name+" "+No);
	
		
	}
}

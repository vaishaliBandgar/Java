package String;

public class String1 {
	
	public static void main(String[] args) {
		
		
		//sysntax
		
	//	String Rvar name= "values"
		
		String str= "Automation";  //SCP
		String str1= "Automation";  //SCP
		
		
		//by using new keyword
		//syntax
		//String str = new String("values");
		
		String S3= new String("Java");
		String S4= new String("Java");
		String S5= new String("Automation");  //heap
		
		System.out.println(str==str1);  //t
		System.out.println(str==S5);  //false
		System.out.println(S3==S4);    //false
		
		
		
	}

}

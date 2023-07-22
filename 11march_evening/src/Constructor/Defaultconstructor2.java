package Constructor;

public class Defaultconstructor2 {
	
 // default constructor
	//public defaultconstructor2(){
	//super();
	
//}
	
//	Rule
	//1. it always no argument/zero argument constructor
	//2- access modifiers of the default constructor is same as class modifiers.
	//3.Default constructor contains only one line that is super() class/keywords
	
	//the default constructor is used to provide the default values to the object
	//ex -null, 0, false
	
	public static void main(String[] args) {
		
		Defaultconstructor2 D2 =new Defaultconstructor2();
		Defaultconstructor2 D3 =new Defaultconstructor2();
		
		D2.M1();
		D2.M1();
		D2.addition();
		
		D3.addition();
		
	}
	
	public void M1() {
		System.out.println("Hello");
		
	}
	public void addition() {
		int a=10;
		int b=20;
		int add=a+b;
		
		System.out.println(add);
		
	}

}

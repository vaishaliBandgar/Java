package ThisandSuper;


public class Sample3 extends Sample2{
	//int Roll no= 10;
	//String Name="Java";  non static GV
	
	//what is the use of super keyword
	//Sk is used to access global variables from diff class/ super class
	
	int RollNo =20;
	String name ="Selenium";
	
	
	public void Demo() {
		
		int RollNo =30;
		String name = "python";
		System.out.println(RollNo);  //30
		System.out.println(name);   //python
		
		System.out.println();
		System.out.println(this.RollNo); //20
		System.out.println(this.name);   //selenium
		
		System.out.println();
		System.out.println(super.RollNo); //10
		System.out.println(super.Name); //java
		
	}
	public static void main(String[] args) {
		
		Sample3 S2 =new Sample3();
		S2.Demo();
		
	}
	
			
	
}
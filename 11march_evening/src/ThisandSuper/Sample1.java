package ThisandSuper;

public class Sample1 {
	int Number =100;
	int Num =200;
	String Name ="Automation";
	
	//What is use of this keyword
	//This keyword is used to access global variables from the same class
	
	public void Test() {
		
		int Number =500;  //non Lv
	    int Num = 600;
	    
	    System.out.println(Number); //500
	    System.out.println(Num); //600
	    System.out.println(Name);
	    System.out.println();
	    
	    System.out.println(this.Number);
	    System.out.println(this.Num);
	    
	}
	public static void main(String[] args) {
		
		Sample1 S1= new Sample1();
		S1.Test();
		
		}

}

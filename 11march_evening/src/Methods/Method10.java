package Methods;

public class Method10 {
	
	//static regular with parameter
	public static void main(String[] args) {
		
		
		addition (33,44);
	    Method10.addition(10,30);
		
		Method10.addition(30,50);
		
		
		substraction(44,22);
	    Method10.substraction(30, 10);
		   
		addition1 (44,22,10);
		Method10.addition1(56, 30, 10);
	
	}
	
	public static void addition(int a, int b) { //10 30  30,50// two ip method
		//10+30 30+50=80
		int C= a+b;
		System.out.println("adition of two is-->" +C);
		
	}
	public static void substraction(int a, int b) { // two i/p method
		
		int C= a-b; //30-10
		System.out.println("sub of two is-->" +C);

}
	public static void addition1(int a, int b, int c) { //three input parameter method
		int sum =a+b-c;  //44+22-10
		System.out.println("addition /sub of three no is--->" +sum);
		
	}
	
}

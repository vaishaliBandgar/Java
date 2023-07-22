package Logicalprog;

public class SwappingTwonoWithoutThirdvar {
	
	//swapping two no without third variabel
	
	public static void main(String[] args) {
		
		int a=10, b=20; 
		
		System.out.println("Before swapping values :"+a+" "+b);
		
		a=a+b; //30
		b=a-b; //10
		a=a-b;  //20
		System.out.println("After swapping values :"+a+" "+b);
		
		
	}

}

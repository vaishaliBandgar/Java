package Controlstatement;

public class Nestedifstatement1 {
	public static void main(String[] args) {
		
		int a= 100;
		int b= 200;
		int c= 300;
		
		if (a>b) {
			if (a>c) {
				System.out.println("A is greatest number");  //false
			}
			
		}
		else if(b>c) { //200>300
			System.out.println("B is greatest number");  //false
			
		}
		else {
			System.out.println("c is greatest number");
		}
		
	}

}

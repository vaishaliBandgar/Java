package Logicalprog;

public class Fibonaccisseries {
	
	public static void main(String[] args) {
		
		//Fs -next number is sum of two number
		
		//0,1,1,2,3,5,8,13,21,34
		
		int a=-1,b =1 ,c;
		
		for(int i =1;i<=10;i++) {
			c=a+b;               //0
			
			System.out.println(""+c);
			
			a=b;   //1
			b=c;   //0
		}
		
	}

}

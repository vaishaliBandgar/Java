package Logicalprog;

import java.util.Scanner;

public class AcceptUserInput {
	


	public static void main(String[] args) {
		
		System.out.println("enter a number");
		
		Scanner Sc =new Scanner(System.in);
		 int num = Sc.nextInt();
		 
		 System.out.println("enter seconf number");
		 int num1 = Sc.nextInt();
		System.out.println("Addition of two no is ="+(num+num1));
		System.out.println("Addition of two no is ="+(num-num1));
	}

}

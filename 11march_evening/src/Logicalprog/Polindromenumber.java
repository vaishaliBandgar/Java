package Logicalprog;

import java.util.Scanner;

public class Polindromenumber {
	
	public static void main(String[] args) {
		
		int Originalnumber,sum,rem;
		//1221---1221
		//12345;--54321
		System.out.println("Enter an number");
		Scanner Sc = new Scanner(System.in);
		int num=Sc.nextInt();
		Originalnumber=num;
		//121
		//121>0--true
		//121/10---12
		//12>0==true
		//12/10--1
		//1>0--true
		//1/10-0
		//0>0--false
		for(sum=0;num>0;num=num/10) {
			
			rem= num%10;               //121%10    12%10  1%10  --1
			
			sum=sum*10+rem;          //0=0*10+1=1      1=1*10+2=21      12=12*10+1=121
			
		}
		//121=121
		if(sum==Originalnumber) {
			System.out.println(Originalnumber+"----is a palindromenumber");
			
		}
		else {
			System.out.println(Originalnumber+"----is not a palindromenumber");
			
		}
		
	}

}

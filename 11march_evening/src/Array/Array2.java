package Array;

import java.util.Arrays;

public class Array2 {

   public static void main(String[] args) {
		
		char C1[] =new char[5];  //0 to 4
		
		C1[0] ='A';
		C1[1] ='C';
		C1[2] ='1';
		C1[3] ='2';
		C1[4] ='D';
		
		//C1[5]='F';  //ArrayIndexoutofboundsException
		
		System.out.println(C1.length);
		
		for(int i=0;i<C1.length;i++){
			
			System.out.println(" "+C1[i]);
		
		
		}
	System.out.println();
	Arrays.sort(C1);
	
	for(int i=0;i<C1.length;i++) {
		
		System.out.println(" "+C1[i]);
		
	}
	}
	
	

}

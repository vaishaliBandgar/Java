package Array;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		
		
		int D2[]=new int[7];
		D2[0]= 10;
		
		int arr[]= {2, 3, 4, 66, 33,34};
		
		System.out.println(arr[2]);  //4 
		System.out.println(arr[5]);  //66
		
		for(int i=0; i< arr.length; i++) { 
			
			System.out.println(arr[i] +  "");
		}
		
		System.out.println();
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length; i++) {  //2 3 4 33 34  66
			
			System.out.println(arr[i]+ "");
		}
		
		
		
		
	}
		



}

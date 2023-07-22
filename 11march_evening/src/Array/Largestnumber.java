package Array;

public class Largestnumber {
	
	public static void main(String[] args) {
		
		
		int arr[]= {3,5,455,595,755};
		
		System.out.println(arr.length);
		int maximum =arr[0];  //33
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>maximum) {
				
				maximum =arr[i];
				
			}
			System.out.println("largest number in given array is---->"  + maximum);
			
			
		}
		
		
	}

}

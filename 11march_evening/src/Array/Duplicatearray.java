package Array;

public class Duplicatearray {
	
	public static void main(String[] args) {
		
		int arr[] = {2, 3,4,5,67,8,9,5,4};
		
		System.out.println("Duplicate element in given a");  //op
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] ==arr[j]) {
					
					System.out.println(arr[j]+ "");   //4 5
				}
			}
		}
	}

}

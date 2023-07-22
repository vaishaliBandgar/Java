package String;

public class String3 {
	public static void main(String[] args) {
		
		//difference between == operataor and .Equals method
		
		String S1 = new String("Java"); 
		String S2 = new String("Java");  
		
		System.out.println(S1 == S2);  //  false ///internal memory
		System.out.println(S1.equals(S2));  //true  ///frontend
		
		String S3 ="java";
		String S4 ="java";
		
		
		System.out.println(S3 == S4);  //true				
		System.out.println(S3.equals(S4));  //true
		
		
		//== Always compare refrence comparison/address comparison
		//refrence comparison means if both refrence point into the same obj thenit will giv true
		
		//.equals method 
	//content comparison means compare the given string based on the content of the string.if any
		//character is not matched if return false.
		//if all character are matched it return true
		
		
		
	}
	
	

}

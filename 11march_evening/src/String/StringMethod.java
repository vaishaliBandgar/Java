package String;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String S1 ="Velocity";
		
		System.out.println("INDEX--->" +S1.charAt(5));
		System.out.println("INDEX--->" +S1.charAt(2));  //charAt method
		// it returns char value for the particular / specified index
		
		//.length
		
		
		System.out.println(S1.length());  //.length it returns length/size
		
		String S2= "java";             //.equals
		String S3= "java";
		String S4 = new String("java");
				
				System.out.println(S2.equals(S3));
				System.out.println(S2.equals(S4));
				
				
				
				String S5 ="Automation";
				
				System.out.println(S5.isEmpty());   //4.isempty
	
				String S6=" ";
				System.out.println(S6.isEmpty());
				
				String S7 ="Automation"; //.Replace
				System.out.println(S7.replace('o','r'));
			//	System.out.println(S7.replace('A' ,'Z'));
				System.out.println(S7.replace('X' ,'Z'));
				
				
				
				String S8 ="04 05 2023";
						System.out.println(S8.replace(' ','/'));
						
						
						//6. replace all
						String S9 ="Python java CPP Classes";
						System.out.println(S9.replaceAll("java CPP", "Ruby"));
						System.out.println(S9.replaceAll(" ", ""));
						
			//			7. substring- 
						
						
				
				
				
				
				
		
		
	}

}

package WrapperClass;

public class Test3 {
	public static void main(String[] args) {
		
		String S1= "200";
		String S2= "400";
		System.out.println(S1+S2);
		
	//	int value1=Integer.parseInt(S1);
		//int value2=Integer.parseInt(S2);  //Number format Exception
		
		double value1=Double.parseDouble(S1);
		double value2=Double.parseDouble(S2);
		
		Double addition=value1+value2;
		System.out.println(addition);
		
		if(addition==600.5) {
			System.out.println("Correct addtion");
		}
		else {
			System.out.println("Incorrect addition");
			
		}
		                                                                                                                                                                                              
		
	}

}

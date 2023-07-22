package Abstraction;

public class TESTclass {
	
	public static void main(String[] args) {
		
		 HDFCBank HB =new  HDFCBank(); //static bindin+ compile p
		 HB.Creditcard();
		 HB.Debitcard();
		 HB.Loan();
		 HB.Funds();
		 
		 
		// RBIBank RB =new RBLBank();
		 
		 System.out.println();
		 
		 RBIBank RB =new HDFCBank();  //DYNAMIC Binding+ rTP
		 
		 RB.Creditcard();
		 RB.Debitcard();
		 RB.Loan();
		 
	//	 HDFCBank HD = RBIBank();
		 
	}

}

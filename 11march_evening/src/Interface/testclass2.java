package Interface;

public class testclass2 {
	
	public static void main(String[] args) {
		
	
	
		HSBCBank HB =new HSBCBank();
		HB.bikeloan();
		HB.Carloan();
		HB.CreditCard();
		HB.DebitCard();
		HB.Goldloan();     //CTP/ STAtic binding
		HB.Homeloan();
		HB.MutualFund();
		HB.Transfermemory();
		HB.personalloan();
		
		
		RBIBank RB1= new HSBCBank();
		RB1.CreditCard();
		RB1.DebitCard();
		RB1.Transfermemory();
		
		System.out.println();
		
		USBank UB1 = new HSBCBank();
		UB1.Carloan();
		UB1.MutualFund();
		
		System.out.println();
		
		BrazilBank BB = new HSBCBank();
		BB.bikeloan();
		BB.personalloan();
		
		
		
		
		
		
	
	
	
	
	}

}
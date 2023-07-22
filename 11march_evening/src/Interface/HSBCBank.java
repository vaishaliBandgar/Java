package Interface;

public class HSBCBank implements RBIBank, USBank, BrazilBank {

	@Override
	public void personalloan() {
		System.out.println("HSBC Bank---personal loan");
		
	}

	@Override
	public void bikeloan() {
		System.out.println("HSBC Bank---Bike loan");
		
	}

	@Override
	public void MutualFund() {
		System.out.println("HSBC Bank---MutualFund");
		
	}

	@Override
	public void Carloan() {
		System.out.println("HSBC Bank---Car loan");
		
	}

	@Override
	public void CreditCard() {
	System.out.println("HSBC Bank---creditcard");
		
	}

	@Override
	public void DebitCard() {
	System.out.println("HSBC Bank---Debitcard");
		
	}

	@Override
	public void Transfermemory() {
	System.out.println("HSBC Bank---Transfermoney");
		
	}
	public void Homeloan() {
		System.out.println("HSBC Bank---Home loan");
	}
	public void Goldloan() {
		System.out.println("HSBC Bank---Gold loan");
		
	}

	
	
		



	
	

}

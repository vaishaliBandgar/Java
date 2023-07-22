package Interface;

public class Testclass {
	
	public static void main(String[] args) {
		
		AdvancedCalculator AC =new AdvancedCalculator(); //static binding/ early bindin/CTP
		
		AC.Addition();
		AC.Addition(10);
		AC.Multiplication();
		AC.substraction();
	
		System.out.println();
		
		AC.Log();
		AC.Tan();
		
		System.out.println();
		
		AC.Sin();
		AC.Cos();
		
		System.out.println();
		
		Calculator C2 = new AdvancedCalculator();  //dynamicbinding/ late bin/ up casting/ Top casting /RTP
		
		C2.Addition();
		C2.Multiplication();
		C2.substraction();
		
		System.out.println();
		
		casio C3= new AdvancedCalculator();
		C3.Log();
		C3.Addition();
		C3.Tan();
		
		
	}

}

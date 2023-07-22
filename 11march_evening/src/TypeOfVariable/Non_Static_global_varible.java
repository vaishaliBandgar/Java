package TypeOfVariable;

public class Non_Static_global_varible {
	
	int age1 =50;  ///non static var
	String name ="Ketan";
	
	public static void main(String[] args) {
		
		Non_Static_global_varible NSG = new Non_Static_global_varible();
		
		//syntax
		//System.out.println(refvarname.varname);
		
		System.out.println(NSG.name);
		
		System.out.println(NSG.age1);
		
		NSG.Test();
	}
	
	
	public void Test() {
		
		int Demo = 40;
		
		name ="RRRR";
		
		System.out.println(Demo);
		System.out.println(name);
		
		
	}	
		
		
}

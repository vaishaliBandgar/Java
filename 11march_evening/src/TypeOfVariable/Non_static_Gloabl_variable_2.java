package TypeOfVariable;

public class Non_static_Gloabl_variable_2 {
	
	String name="Rahul";
	
	public static void main(String[] args) {
		
		//syntax- syso(classname.varname) -static var
		System.out.println(Differentclass.name);
		System.out.println(Differentclass.age);  //static var
		
		//Non global var call from class
		  
		Differentclass DC = new Differentclass();	 
		
		//syntax
		//System.out.println(RVN.VATNAME);
		
		System.out.println(DC.RollNumber);
		System.out.println(DC.Name1);
		
		Non_static_Gloabl_variable_2 NSGV = new Non_static_Gloabl_variable_2();
		
		NSGV.Demo();
		
	}
	
	public void Demo(){
		
		int RR = 55;  //Local var
		System.out.println(RR);
		System.out.println(name);
		
	}
}

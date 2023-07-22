package Constructor;

public class Userdefinecons2 {
	
	//var dec car pro/specification
	//1
	String Name;
	String Model;
	int price;
	String Engine;
	
	public Userdefinecons2(String Name1, String Model1, int price1, String Engine1 ) {  //user define cons
		
		  // 2.var inti
		Name = Name1;
		Model = Model1;
		price = price1;
		Engine =Engine1;
		
		this.Name= Name;
		this.Model= Model;
		this.price= price;
		this.Engine= Engine;
		
	}	
	
	public static void main(String[] args) {
		Userdefinecons2 UD1 = new Userdefinecons2("kia", "seltos", 2000000, "manual");
		Userdefinecons2 UD2 = new Userdefinecons2("Honda", "city", 1900000, "Automatic");
		Userdefinecons2 UD3 = new Userdefinecons2("Tata", "Nexon", 1600000, "manual");
		Userdefinecons2 UD4 = new Userdefinecons2("Maruti", "800", 500000, "Automatic");
		
		
		System.out.println(UD1.Name+" "+UD1.Model+" "+UD1.price+" "+UD1.Engine);
		System.out.println(UD2.Name+" "+UD2.Model+" "+UD2.price+" "+UD2.Engine);
		System.out.println(UD3.Name+" "+UD3.Model+" "+UD3.price+" "+UD3.Engine);
		System.out.println(UD4.Name+" "+UD4.Model+" "+UD4.price+" "+UD4.Engine);
		
		
		
		
		
	}
		
	}
	



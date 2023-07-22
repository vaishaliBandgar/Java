package Polymorphism;

public class Testcar {
	
	public static void main(String[] args) {
		Maruti M1 = new Maruti();
		M1.Start();  //Maruti start
		M1.Stop();
		M1.Refuel();
		M1.Theftydafty();
		
		System.out.println();
		
	
	
     	Car C1= new Car();  //STATIC POLY + COMPILE POLY
	    C1.Start();
	    C1.Stop();
	    C1.Refuel();
	
	    System.out.println();
	    
	    Car C2 =new Maruti(); //dynamic poly+ runtime poly+ Top casting
	    C2.Start();
	    C2.Stop();
	    C2.Refuel();
	    
	    System.out.println();
	    
	 //   Maruti M2= new Car();  // down casting
	    
	    //class cast exception
	    
	    
	
	}
}

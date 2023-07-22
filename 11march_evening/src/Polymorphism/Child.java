package Polymorphism;

public class Child extends Father {
	
	public void Bike() {
		
		System.out.println("Bike--fz");
	}
	
	public void Car(int i) {
		
		System.out.println("Car--swift");  //method defi
	}
	
	
	//@override
	public void Home() {
		System.out.println("Home---BHK");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Father F1 = new Father();
		F1.Home();
		F1.Money();
		F1.Car(10);
		F1.Test();
		
		System.out.println();
		
		Child C1 =new Child();  //static poly
		
		C1.Bike();
		C1.Car(10);
		C1.Home();
		C1.Money();
		
		System.out.println();
		
		Father F2 =new Child();  //dynamic poly/run time poly
		//child class object can be referrd  by parent class ref variable
		
		F2.Car(10);  //swift
		F2.Home();
		F2.Money();
		
	}

}

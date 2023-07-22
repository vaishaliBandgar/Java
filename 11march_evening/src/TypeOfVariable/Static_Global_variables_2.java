package TypeOfVariable;

public class Static_Global_variables_2 {
	
	static int Number = 200;
	static String name ="Rohit";
	
	public static void main(String[] args) {
		//static global variables call from class
		//creating variables outside the method/functions is known as global variables
		
		System.out.println(Number);
		System.out.println(name);
		
		Static_Global_variables_2.Demo1();
		Static_Global_variables_2.Demo2();
		
		Static_Global_variables_2 SGV = new Static_Global_variables_2();
		SGV.Demo3();
		SGV.Demo1();
		SGV.Demo2();
		
		
	}
	public static void Demo1(){
		System.out.println(Number); //200
		System.out.println(name);  //ROhit
		System.out.println();
		
		Number =400;
		name= "Rahul";
		
	}

	public static void Demo2() {
		System.out.println(Number); //400
		System.out.println(name);
		
	}
	public void Demo3(){
		System.out.println(Number);
		System.out.println(name);
	}
}

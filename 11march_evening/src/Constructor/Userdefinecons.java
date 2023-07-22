package Constructor;

public class Userdefinecons {
	
	//without para const
	//var dec
	int Num1;
	int Num2;  //Non static global var
	
	public Userdefinecons() {  //without para cons
		
		//2. var ini
		Num1 =10;
		Num2 =20;
		int add = Num1+Num2;
		
		//use 
		System.out.println(add);
		
	}
	
	public Userdefinecons(int a,int b) {
		
		Num1 =a;
		Num2= b;
		int add = Num1+Num2;
		System.out.println(add);
		
	}
	public void Addition() {
		int sum = Num1+Num2;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		Userdefinecons UD= new Userdefinecons();
//		Userdefinecons UD1= new Userdefinecons(20,20);
	//	UD.Addition();
		
		
	}

}

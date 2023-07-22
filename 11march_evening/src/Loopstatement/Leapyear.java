package Loopstatement;

public class Leapyear {
	
	public static void main(String[] args) {
		
		// condition for leap year
		//year should be divisible by 400 and 4 but not by 100
		
		int Year = 2000;
		
		if(((Year % 4==0)&&(Year%100!=0)) || (Year % 400==0)) {
			System.out.println("specified year is leap year" );
			
		}
		else {
			System.out.println("specified year is not leap year");
		}
		
		// if(Year%400==0){
	//	System.out.println("The year is leap year"+ Year);}
	//}
	//	else if(Year%100==0){
	//	System.out.println("The year is not leap year"+Year);
	//	}
	//	else if(Year%4==0){
	//	System.out.println("The year is leap year"+Year);
    //}
	//	else {
	//	System.out.println("The year is not leap year"+year);
	//	}
		//(2000%4==0 && 2000%100!=0---false) (2000%400==0)true
		
		
	}

}

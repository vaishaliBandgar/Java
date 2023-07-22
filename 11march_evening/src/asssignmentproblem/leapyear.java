package asssignmentproblem;

public class leapyear {
	
	public static void main(String[] args) {
		
		
		int year= 2024;
		
		if(year%4==0) {
			System.out.println("year is leap year");
		}

	else if(year%100==0) {
		System.out.println("Year is not leap year"); 
		
	}
	else if(year%400==0) {
		System.out.println("Year is  leap year"); 
		
	}
	
		
	else {
		System.out.println("year is not leap year");
	}
	}
}



package Controlstatement;

public class Nestedifstatement {
	public static void main(String[] args) {
		
		//blood donation
		
		int age =20;
		int weight =44;
		
		if(age>=18) {
			
			if(weight>=50) {
				System.out.println("you are eligible for blood donation");
			}
			else if(weight<=50) {
				System.out.println("you are not eligible for blood donation");
			}
		}
		else {
			System.out.println("age must be greater than 18");
		}
			
		}
	}



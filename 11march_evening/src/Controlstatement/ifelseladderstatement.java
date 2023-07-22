package Controlstatement;

public class ifelseladderstatement {
	
	public static void main(String[] args) {
		/*
		 * if else-if ladder
		 * Syntax
		 if(condition 1){
		 statement 1-----execute when condition is true
		 }
		 
		 else if(condition 2){
		  statement 2-----execute when condition is true
		 }
		 else if(condition 3){
		  statement 3-----execute when condition is true
		 }
		 else (condition ){
		  statement 4-----execute when all condition is false
		 }
		 
		 * 
		 */
		
		int marks =25;
		
		if(marks>=65) {
		System.out.println("distiction");  //flase
	}
	else if(marks>=60) {
		System.out.println("first calss"); //false
		
	}
	else if(marks>=55) {
		System.out.println("higher second calss"); //false
		
	}
	else if(marks>=50) {
		System.out.println("second calss"); //false
		
	}
	else if(marks>=35) {
		System.out.println("pass"); //false
		
		}
	else {
		System.out.println("failed");
	}
	}

}

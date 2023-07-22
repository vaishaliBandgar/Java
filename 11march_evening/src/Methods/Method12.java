package Methods;

public class Method12 {
	
	// Student Info-- name, Rollno, grade, percen
	public static void main(String[] args) {
		
		Method12.StudentInfo("vaishali" ,22 , 'A', 50.56f);		
		Method12.StudentInfo("John" ,28 , 'B', 80.56f);	
		Method12.StudentInfo("Tom" ,72 , 'C', 78.56f);	
		Method12.StudentInfo("vishal" ,12 , 'A', 98.56f);	
		
		
		
		
		
		
		
		
		
		
	}
	public static void StudentInfo(String Studentname, int RollNO, char Grade, float Percentage) {
		System.out.println("StudentName-->"+Studentname+" "+"Student RollNo-->"+RollNO+" "+ "Student Grade-->"+Grade+ " "+"Student percentage-->"+Percentage);
		
	}

}

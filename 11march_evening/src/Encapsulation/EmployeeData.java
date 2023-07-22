package Encapsulation;

public class EmployeeData {
	//implement encapsulation
	//private data variable can not access directly from outside the class
	
	private int IDnumber;
	private String EmpName;
	private int EmpAge;
	
	public static void main(String[] args) {
		
		EmployeeData ED = new EmployeeData();
		
		ED.setIDnumber(56366);
		ED.setEmpName("John");
		ED.setEmpAge(30);
		System.out.println("Employee name is:" + ED.getEmpName());
		System.out.println("Employee age is:" + ED.getEmpAge());
		System.out.println("Employee ID is:" + ED.getIDnumber());


	}
	//getter and setter methods is to set and get the values of the fields
	
	public int getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(int IDnumber) {
		this.IDnumber =IDnumber;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this. EmpName = EmpName;
	}

	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int EmpAge) {
		this.EmpAge =EmpAge;
	}


}

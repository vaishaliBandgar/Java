package Encapsulation;

public class EMpdata1 {
public static void main(String[] args) {
		
		EmployeeData ED = new EmployeeData();
		
		ED.setIDnumber(4466);
		ED.setEmpName("Josef");
		ED.setEmpAge(32);
		System.out.println("Employee name is:" + ED.getEmpName());
		System.out.println("Employee age is:" + ED.getEmpAge());
		System.out.println("Employee ID is:" + ED.getIDnumber());

}
}
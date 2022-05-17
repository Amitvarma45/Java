package Corejava;

class Employee{
	
	public void emp_name() {
		
		System.out.println("Amit Varma");
	}
}

class Department extends Employee{
	
	public void department_name() {
		
		System.out.println("Web Development");
	}
    	
 }

public class singleInheritassign {

	public static void main(String[] args) {
		
		Department dp = new Department();
		
		dp.emp_name();
		dp.department_name();

	}

}

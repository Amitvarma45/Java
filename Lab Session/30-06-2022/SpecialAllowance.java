package LabSession;

public class SpecialAllowance {
	 public static void main(String[] args) {
	        //object of Manager class
	        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
	        double salary = m.calculateSalary(); 
	        //printing output
	        System.out.println("Manager's Salary : "+salary);
	        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
	    }
}

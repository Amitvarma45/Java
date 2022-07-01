package LabSession;

import java.util.Scanner;

public class SpecialAllowance {
	 public static void main(String[] args) {
		 	//object of scanner class
		 	Scanner sc = new Scanner(System.in);
	        //object of Manager class
	        ManagerOne m = new ManagerOne(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(),sc.nextLong(),sc.nextDouble());
	        double salary = m.calculateSalary(); 
	        //printing output
	        System.out.println("Manager's Salary : "+salary);
	        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
	    }
}

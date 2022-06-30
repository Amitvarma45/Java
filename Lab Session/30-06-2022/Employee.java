package LabSession;

public class Employee {
		//variables
	 	private long employeeId,employeephone; 
	    private String employeeName,employeeAddress; 
	    private double basicSalary,specialAllowance,Hra;	    
	    
	    //Overloaded Constructor
	    Employee() 
	    {
	        employeeId = 0; 
	        employeephone = 0; 
	        employeeName = ""; 
	        employeeAddress=""; 
	        basicSalary=0.0; 
	        specialAllowance=250.00; 
	        Hra = 1000.50; 
	    } 
	    
	    //parameterized Constructor
	    Employee(long id,String n,String a,long p,double s) 
	    {
	        employeeId = id; 
	        employeephone = p; 
	        employeeName = n; 
	        employeeAddress=a; 
	        basicSalary=s; 
	        specialAllowance=250.00; 
	        Hra = 1000.50; 
	    }
	    //getter method for Basic salary
	    public double getBasicSalary()
	    {
	        return basicSalary;
	    }

	    // method calculateSalary
	    public double calculateSalary()
	    {
	        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
	        return salary;
	    }
	    // method calcualteTransportAllowance
	    public double calculateTransportAllowance()
	    {
	        return 0.01*basicSalary;
	    }
	}

class Manager extends Employee
{
	//parameterized constructor
    Manager(long id,String n,String a,long p,double s) 
    { 
        super(id,n,a,p,s);
    }
    
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getBasicSalary();
    } 
}

 class Source
{
    public static void main(String[] args) {
        //object of Manager class
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
        double salary = m.calculateSalary(); 
        //printing output
        System.out.println("Manager's Salary : "+salary);
        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
    }
}
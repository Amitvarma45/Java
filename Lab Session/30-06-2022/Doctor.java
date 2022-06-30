package LabSession;

import java.util.Scanner;

class Doctor {
	//variables
	private int doctorId;
    private String doctorName, location;
    
    //parameterized Constructor
    Doctor(int i,String n,String l)
    {
        doctorId = i;
        doctorName = n;
        location = l;
    }

    //setters
    public void setDoctorId(int i) {
        doctorId = i;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    //methos getDetails
    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Location: "+location);
    }
}


class SpecialistDoctor extends Doctor
{
	//variable
    private String specialist;
    
    //getter & setters
    public void setSpecialist(String s) {
        this.specialist = s;
    }

    public String getSpecialist() {
        return specialist;
    }

    //toString Method
    SpecialistDoctor(int i,String n,String l,String s)
    {
        super(i, n, l);
        specialist = s;
    }

    //method getDetails
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Specialist: "+specialist);
    }
}
 class Result {
    public static void main(String[] args) {
    	
    	//object of Scanner class
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();

        //if else statements
        if(t.equalsIgnoreCase("Specialist"))
        {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else if(t.equalsIgnoreCase("Doctor"))
        {
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }
}

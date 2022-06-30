package LabSession;

import java.util.Scanner;

class Details  {
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

package Corejava;

import java.util.Scanner;

public class logicalAndOperatorsAssign {

	public static void main(String[] args) {
		
		//creating object of sccaner class
		Scanner sc= new Scanner(System.in);
		
		// Initializing variables
		int result;
		
		//taking value from user
		System.out.println("value of a :");
		int a=sc.nextInt();
		System.out.println("value of b :");
		int b=sc.nextInt();
		System.out.println("value of c :");
		int c=sc.nextInt();
		System.out.println("value of d :");
		int d=sc.nextInt();
		
		//using logical AND operator to Verify Two constraints
		if((a<b) && (b==d)) {
            
            result=a+b+c+d;
            System.out.println("Sum is: " +result);
        }

 

        else { 
            System.out.println("False Condition");
		
        }

	}
}

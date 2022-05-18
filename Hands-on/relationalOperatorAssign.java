package Corejava;

import java.util.Scanner;

public class relationalOperatorAssign {

	public static void main(String[] args) {
		
		//Crating Object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking Input values from User
		System.out.println("Enter Your First No : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Your Second No : ");
		int num2=sc.nextInt();
		
		//Relational Operators//
		
		//is equal to
		  System.out.println("num1 == num2 = " + (num1 == num2) );
		  //is not equal to
		  System.out.println("num1 != num2 = " + (num1 != num2) );
		  //Greater than
		  System.out.println("num1 >  num2 = " + (num1 >  num2) );
		  //Less than
		  System.out.println("num1 <  num2 = " + (num1 <  num2) );
		  //Greater than or equal to
		  System.out.println("num1 >= num2 = " + (num1 >= num2) );
		  //Less than or equal to
		  System.out.println("num1 <= num2 = " + (num1 <= num2) );


	}

}

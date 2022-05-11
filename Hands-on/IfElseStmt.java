package Corejava;

import java.util.Scanner;

public class IfElseStmt {
	public static void main(String[] args) {
		
		//crating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking value from user
		System.out.println("Enter Your Age :");
		int age=sc.nextInt();
		
		//if else statement
		if(age<=18) {
			System.out.println("You are not eligible for voting");
		}else {
			System.out.println("You are eligible for voting");
		}
		
	}

}

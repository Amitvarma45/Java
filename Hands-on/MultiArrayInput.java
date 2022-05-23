package Corejava;

import java.util.Scanner;

public class MultiArrayInput {
	
	//Initializing array 
	public static void main(String[] args) {
		int i, j; 
		
		int[][] a = new int[3][3];
		
		//creating scanner class object 
		Scanner s = new Scanner(System.in); 
		
		System.out.print("Enter 9 elements for matrix:\n "); 
		for(i=0; i<3; i++) { 
			for(j=0; j<3; j++) { 
				a[i][j] = s.nextInt(); 
			} 
			} 
		
		System.out.println("\n----Matrix Is----"); 
		for(i=0; i<3; i++) { for(j=0; j<3; j++) { 
			System.out.print(a[i][j]+ " "); 
			} 
		System.out.print("\n"); } 
		} 
		
		
		
}


package Corejava;

import java.util.Scanner;

public class logicalNotAssign {

	public static void main(String[] args) {
		
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
        
  
        // taking values from user
		
        System.out.println("Value of a = " );
        int a=sc.nextInt();
        
        System.out.println("Value of b = " );
        int b=sc.nextInt();
  
        // Using logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

	}

}

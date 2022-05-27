package Corejava;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		
		int a=0,sum = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your value : ");
		int len = sc.nextInt();
		
		
		System.out.println("Sum of first "+len+" natural no.s is : ");
		
		
		for( a=0;a<=len;a++) {
			
			 sum =sum+a;		
					
				}
		System.out.println(sum);

	}

}

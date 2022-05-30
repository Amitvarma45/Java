//program for Sum of first 10 natural no.s

package Corejava;

import java.util.Scanner;

 class SumOfNaturalNo {

	public static void main(String[] args) {
		
		//creating a & sum variable using int datatype
		int a=0,sum = 0;
		
		//creating object of Scanner class
		Scanner sc= new Scanner(System.in);
		
		//taking first n natural nos from user
		System.out.println("Enter Your value : ");
		int len = sc.nextInt();
		
		//printing Output
		System.out.println("Sum of first "+len+" natural no.s is : ");
		
		//creating for loop for adding natural nos.
		for( a=0;a<=len;a++) {
			
			 sum =sum+a;		
					
				}
		System.out.println(sum);

	}

}

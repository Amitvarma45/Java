package Corejava;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		
		int a=0,sum = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1 to 10 No.s : ");
		for(int i = 0;i<10;i++) {
			 a =sc.nextInt();
		}
		
		System.out.println("Sum of first 10 natural no.s is : ");
		
		
		for( a=0;a<=10;a++) {
			
			 sum =sum+a;		
					
				}
		System.out.println(sum);

	}

}

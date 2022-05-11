package Corejava;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] arg) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Value :");
		int num=sc.nextInt();
		int i=1,tab;
		while(i<=10) {
			tab=num*i;
			
			System.out.println(tab);
			i++;
			
		
		}
	}


}

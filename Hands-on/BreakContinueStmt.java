package Corejava;

import java.util.Scanner;

public class BreakContinueStmt {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your No between 1 to 10 : ");
		int num1=sc.nextInt();
		
		int result;
		
		for(int i=0;i<20;i++) {
			
			result=num1+i;
			
		 if(result==15) {
			 
			 continue;
			 
		 }else if(result>18) {
			 
			 break;
		 }
		 System.out.println(result);

		}
		
	}

}

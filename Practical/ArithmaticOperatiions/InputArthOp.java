package Corejava;

import java.util.Scanner;

public class InputArthOp {
	public static void main(String[] args)
	{
		//creating Scanner Object
		Scanner sc= new Scanner(System.in);
		
		//Getting value from user		
		System.out.println("Enter First No.");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second No.");
		int num2=sc.nextInt();
		
		//writing operation		
		int add,sub,mul,div,mod;
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		
		//Getting Result		
		System.out.println("Addition is : "+add);
		System.out.println("Subtraction is : "+sub);
		System.out.println("multiplication is : "+mul);
		System.out.println("Division is : "+div);
		System.out.println("Modulo is : "+mod);
		
		
	}

}

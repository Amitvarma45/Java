//Program for Creating a file Using ExceptionHandling  

package Corejava;

import java.io.FileInputStream;

public class ExceptionHandlingProgram {

	public static void main(String[] args) {
		
		//Using try block for testing code Error
		try{
			
		//Creating object of FileInputStream	
		FileInputStream fint = new FileInputStream("D:\\ExceptionTest.txt");
		
		//Creating variable i using Int DataType
		int i=0;
		
		//Using While loop reading value from file
		while((i=fint.read())!=-1) {
			
			//Printing value of file
			System.out.print((char)i);
		}
		
		//Closing FileInputStream
		fint.close();
		}
		//Using Catch for Exception Handling
		catch(Exception e){
			System.out.println(e);
		}
	}

}

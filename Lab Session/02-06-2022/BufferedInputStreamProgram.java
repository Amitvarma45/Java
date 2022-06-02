//program to demonstrate on BufferedInputStream

package Corejava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamProgram {
	
	//main method
	public static void main(String[] args) throws Exception {
		
		//Creating object of FileInputStream 
		FileInputStream fins = new FileInputStream("D:\\JavaTest.txt");
		
		//Creating Object of BufferedInputStream
		BufferedInputStream bis = new BufferedInputStream(fins);
		
		//Creating variable a using int DataType
		int a=0;
		
		//Using While ForGetting values from file
		while((a=fins.read())!=-1) {
			
			//Printing Output
			System.out.print((char)a);
		}
		
		//Closing FileInputStream
		fins.close();
		
		//Closing BufferdInputStream
		bis.close();
		

	}

}

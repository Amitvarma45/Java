//Program for Demonstrate On FileOutputStream

package Corejava;

import java.io.FileOutputStream;

public class FileOutputStreamProgram {
	
	//main method
	public static void main(String[] args) throws Exception {
		
		//Creating object of FileOutputStream 
		FileOutputStream Fout = new FileOutputStream("D:\\JavaTest2.txt");
		
		//Creating variable s using String DataType
		String s = ("Hi... I am Developer");
		
		//Creating Byte Array
		byte b[]=s.getBytes();
		
		//Calling Write method
		Fout.write(b);
		
		//Closing FileOutputStream
		Fout.close();
		
		//Printing Output
		System.out.println("You are Successful");


	}

}
//Program for Demonstrate On FileInputStream

package Corejava;

import java.io.FileInputStream;

public class FileInputStreamProgram {
	
	//main method
	public static void main(String[] args) throws Exception {
		
		//Creating Object of FileInputStream
		FileInputStream Fism = new FileInputStream("D:\\JavaTest.txt");
		
		//Creating variable i using Int DataType
		int a= 0;
		
		//Using While to Reading Data
		while((a=Fism.read())!=-1){
			//Printing Output
			System.out.print((char)a);
			
		}
		//Closing File InputStream
		Fism.close();

	}

}

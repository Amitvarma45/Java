package Corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {
		
		//Creating Object of FileWriter		
	    FileWriter writer = new FileWriter("D:\\testout.txt");  
		
	    //Creating Object Of BufferedWritter
	    BufferedWriter buffer = new BufferedWriter(writer);  
		
	    //adding text to write
	    buffer.write("Welcome to NAVI MUMBAI.");  
		
	    buffer.close();  
		
	    //printing output
	    System.out.println("Success");  
		
	    } 
}

package Corejava;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class BufferOutputStreamEx {
	public static void main(String args[])throws Exception{    
		
		//Creating Object of FileOutputStream
	     FileOutputStream fout=new FileOutputStream("D:\\bufferout.txt");    
		
	     //Creating Object of BufferedOutputStream
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
		
	     //Creating S variable Of String DataType
	     String s="Welcome to javaTpoint.";    
		
	     //Creating Array of byte datatype
	     byte b[]=s.getBytes();    
		
	     //Calling write 
	     bout.write(b);    
		
	     //calling flush
	     bout.flush();  
	     
		//closing BufferedOutputStream
	     bout.close();    
		
	     //closing FileOutputStream
	     fout.close();    
	     
		//Printing Output
	     System.out.println("success");    
		
	}   
}

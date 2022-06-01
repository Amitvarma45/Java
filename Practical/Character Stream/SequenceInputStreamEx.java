package Corejava;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {
	public static void main(String args[])throws Exception{    
		
		//Creating Object of FileInputStream 
		 FileInputStream input1=new FileInputStream("D:\\newFile.txt");    
		 FileInputStream input2=new FileInputStream("D:\\myFile.txt");
		 
		 //Creating Object of SequenceInputStream
		 SequenceInputStream inst=new SequenceInputStream(input1, input2);  
		 
		 //Creating Variable j of int DatType
		int j;   
		
		//Using While loop reading values
		while((j=inst.read())!=-1){    
		 System.out.print((char)j);    
		 }   
		
		//closing SequenceInputStream
		 inst.close();    
		//Closing FileInputStream 
		 input1.close();    
		 input2.close();     
		 } 
}

package Corejava;

import java.io.FileInputStream;

class FileInputStreamEx {
	public static void main(String args[]){   
		
		//creating try and catch block
		try{     
			
			//Creating object of FileInputStream
			FileInputStream fin=new FileInputStream("D:\\testout.txt");   
			
			//Creating variable i using int DataType
			int i=0;  
			
			//Using while loop for read value
			while((i=fin.read())!=-1){    
			System.out.print((char)i);    
		  }    
		  fin.close();    
		 }catch(Exception e){
			 //printing Exception
			 System.out.println(e);
			 }         
		}  
}

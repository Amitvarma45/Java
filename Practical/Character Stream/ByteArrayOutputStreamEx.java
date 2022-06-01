package Corejava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx {
	public static void main(String args[])throws Exception{ 
		
		//Creating Object OF FileOUtput Stream
	      FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
	      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
	    
	      //Creating Object of ByteArrayOutputStream
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();  
	      
	      //calling write method
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect 
	     //Printing Output
	      System.out.println("Success...");    
	     }    

}

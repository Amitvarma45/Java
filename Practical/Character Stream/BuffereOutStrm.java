package Corejava;

import java.io.FileOutputStream;

class BuffereOutStrm {
	public static void main(String args[]){   
		
		//Using try and catch block
		  try{ 
			  //Creating Object of FileOutputStream 
			  FileOutputStream fout=new FileOutputStream("D:\\myfile.txt"); 
			  
			  //Calling Write
			  fout.write(65);    
			  
			  //Closing FileOutputStream
			  fout.close();       
			  
			  //Printing Output
			  System.out.println("success...");         
		   }
		  catch(Exception e){
			  //Printing Exception
			  System.out.println(e);
			  }        
		  }   
}

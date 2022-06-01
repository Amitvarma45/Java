package Corejava;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws IOException { 
		
		//Creating object of FileInputStream
	    FileInputStream input = new FileInputStream("D:\\newfile.txt");
	    //Creating object of DataOutputStream
	    DataInputStream inst = new DataInputStream(input);
	    //creating count variable int type
	    int count = input.available();  
	    //creating byte array
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k+"-");  
	    }  
	  }  

}

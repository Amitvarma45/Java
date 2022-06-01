package Corejava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream {
	public static void main(String args[])throws Exception{             
		
		//Creating object of InputStreamReader
	    InputStreamReader r=new InputStreamReader(System.in);    
		
	    //Creating Object of BufferedReader
	    BufferedReader br=new BufferedReader(r);            
		
	    //Printing statement
	    System.out.println("Enter your name");    
		
	    String name=br.readLine();    
		
	    //Printing Output
	    System.out.println("Welcome "+name);    
		
	}   
}

package Corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamExample {
    public static void main(String[] args) throws IOException { 
    	//Creating Object of File
        File data = new File("D:\\testout.txt");
        //Creating object of FileOutputStream
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to Mumbai.";    
        //Creating Byte Array
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  

}

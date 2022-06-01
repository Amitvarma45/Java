package Corejava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamExample {
	public static void main(String[] args) throws IOException { 
		//Creating Object of File
        File data = new File("D:\\testout.txt");  
        //Creating object of FileInputStream
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file); 
        //creating variable k of int type
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  

}

package Corejava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
    public static void main(String[] args) throws IOException {  
    	
    	//Creating object of FileOUtputStream
        FileOutputStream file = new FileOutputStream("D:\\myfile.txt");  
        
        //Creating Object of DataOutputStream
        DataOutputStream data = new DataOutputStream(file);  
        
        //Calling write method
        data.writeInt(65);  
        data.flush();  //closing flush
        data.close();  //closing dataoutputstream
        
        //printing Output
        System.out.println("Succcess...");  
    }  

}

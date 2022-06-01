package Corejava;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {
		
		//Creating object of FileReader
		FileReader file = new FileReader("D:/newFile.txt");
		
		//Creating object of BufferedReader
		BufferedReader br = new BufferedReader(file);
		//creating variable i of int data type 
		int i;
		while((i=file.read())!=-1){
			
			System.out.print((char)i);
		}
		br.close();
		file.close();

	}

}

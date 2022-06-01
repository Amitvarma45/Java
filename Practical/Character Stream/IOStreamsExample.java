package Corejava;

import java.io.*; 
public class IOStreamsExample { 
	public static void main(String args[]) throws IOException { 
		//Creating FileReader object 
		File file = new File("D:/newfile.txt"); 
		FileReader reader = new FileReader(file); 
		char chars[] = new char[(int) file.length()]; 
		//Reading data from the file 
		reader.read(chars); 
		//Writing data to another file 
		File out = new File("D:/copyOfnewfile.txt"); 
		FileWriter writer = new FileWriter(out); 
		//Writing data to the file 
		writer.write(chars); 
		writer.flush(); 
		System.out.println("Data successfully written in the specified file"); 
		} 
	
	}


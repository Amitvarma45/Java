package Corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len; //length of Array
		  Scanner sc = new Scanner(System.in);
		  
		  
		  System.out.println("Enter Array length");
		  len=sc.nextInt();
		  Integer arr[]=new Integer[len];
		  System.out.println("Enter: "+len+" Elements To Store In Array\n");
		    for(Integer i=0;i<len;i++) {
		        arr[i]=sc.nextInt();
		    }
		    
		 // Sorts arr[] in ascending order 
			Arrays.sort(arr); 
			System.out.printf("In Ascending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr)); 
			
			// Sorts arr[] in descending order 
			Arrays.sort(arr, Collections.reverseOrder()); 
			
			// Lastly printing the above array 
			System.out.printf("In descending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr)); 
			} 

	}



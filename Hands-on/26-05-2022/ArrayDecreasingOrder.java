package Corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDecreasingOrder {

	public static void main(String[] args) {
		
		int len; 
		Scanner sc = new Scanner(System.in);
		  
		  
		System.out.println("Enter Array length");
		len=sc.nextInt();
		Integer arr[]=new Integer[len];
		System.out.println("Enter: "+len+" Elements To Store In Array\n");
		    for(Integer i=0;i<len;i++) {
		        arr[i]=sc.nextInt();
		    }
		    
		    Arrays.sort(arr, Collections.reverseOrder()); 		
			 
			System.out.printf("In descending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr)); 
			} 
	}



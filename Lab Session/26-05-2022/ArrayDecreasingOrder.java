//Program for Decreasing order of Array

package Corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDecreasingOrder {

	public static void main(String[] args) {
		
		//Creating len variable using int data type
		int len; 
		
		//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		  
		//taking Input value from User
		System.out.println("Enter Array length");
		len=sc.nextInt();
		
		//Creating Integer array
		Integer arr[]=new Integer[len];
		System.out.println("Enter: "+len+" Elements To Store In Array\n");
		
		//Using for loop for taking values
		    for(Integer i=0;i<len;i++) {
		        arr[i]=sc.nextInt();
		    }
		    
		    //Using collection for getting reverse order of array
		    Arrays.sort(arr, Collections.reverseOrder()); 		
			 
		    //printing Output
			System.out.printf("In descending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr)); 
			} 
	}



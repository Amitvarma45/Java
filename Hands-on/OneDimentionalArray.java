package Corejava;

public class OneDimentionalArray {

	public static void main(String[] args) {
		String a[]=new String[5];
		
		a[0]="Amit";
		//initialization
		a[1]="Suraj";
		a[2]="Pradyumna";
		a[3]="Pawan"; 
		a[4]="Shubham"; 
		
		//traversing array 
				for(int i=0;i<a.length;i++)
					//length is the property of array 
					System.out.println(a[i]); 
				}		

	}



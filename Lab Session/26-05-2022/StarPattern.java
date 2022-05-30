//program for printing following Star Pattern
//  *
//  **
//  ***
//  ****
//  *****

package Corejava;

public class StarPattern {

	public static void main(String[] args) {
		
	
	
		//Using For loop for creating star pattern
		for(int i=0;i<6;i++) {				
			for(int j=0;j<i;j++) {
			System.out.print("*");
			
			}
			System.out.println(" ");
		}

	}

}

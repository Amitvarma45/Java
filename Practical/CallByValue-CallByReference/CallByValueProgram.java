package Corejava;

public class CallByValueProgram {
	
	//Method to swap numbers 
	static void swap(int a, int b) {
		
		//Creating temp variable in stack memory
		//and update value in it
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Before swaping Value of x = "+a+" y = "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing variable x and y;
		int x = 5;
		int y = 7;
		
		//calling swap method
		swap(x,y);
		System.out.println("After swaping Value of x = "+x+" y = "+y);
		

	}

}

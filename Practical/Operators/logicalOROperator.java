package Corejava;

public class logicalOROperator {

	public static void main(String[] args) {
		//Initializing Variables
		int a=1,b=10,c=10,d=30;
		
		//Displaying a,b,c
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		System.out.println("Value of c : "+c);
		System.out.println("Value Of d : "+d);
		
		//using logical OR operator to verify two constraints
		if((a<b || c==d)) {
			System.out.println("One or both" + " the conditions are true");
		}
        else
            System.out.println("Both the" + " conditions are false");

	}

}

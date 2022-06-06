package Corejava;

public class CallByReferenceExample {

	//Initializing variable a and b;
	int a = 25;
	int b = 20;
	
	//Calling call function
	void call(CallByReferenceExample c) {
		int temp = c.a;
		c.a=c.b;
		c.b=temp;
		
	}
	//Main method
	public static void main(String[] args) {
		
		
		//Creating object of CallByReferenceExample
		CallByReferenceExample c = new CallByReferenceExample();
		System.out.println("Before swaping Value of x = "+c.a+" y = "+c.b);
		
		//Calling CallByReferenceExample
		c.call(c);
		System.out.println("After swaping Value of x = "+c.a+" y = "+c.b);

	}

}

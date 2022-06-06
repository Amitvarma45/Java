package Corejava;

public class CallByReferenceProgram {

	
		/*
		* The original value of 'a' will be changed as we are trying
		* to pass the objects. Objects are passed by reference.
		*/

		int a = 10;
		 
		void call(CallByReferenceProgram c) {
		c.a = c.a+10;
		}

		public static void main(String[] args) {

		CallByReferenceProgram c = new CallByReferenceProgram();
		System.out.println("Before call-by-reference: " + c.a);

		// passing the object as a value using pass-by-reference
		c.call(c);
		System.out.println("After call-by-reference: " + c.a);


		

	}

}

package Corejava;

   class abstractionone extends abstraction {
	 
	 public  int multiply (int n1, int n2) {
		 return n1*n2;
	 }
	 public  int multiplyone (int n1, int n2, int n3) {
		 return n1*n2*n3;
	 }
	 public static void main(String[] args) {
		 abstraction ab = new abstractionone();
		 
		 System.out.println("Multiplication of 2 numbers: " +ab.multiply(10, 50));
		 System.out.println ("Multiplication of 3 numbers: " +ab.multiplyone(5, 8, 10)); 
		 
	 }

}

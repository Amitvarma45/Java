package Corejava;

 class abstractassign extends abstractionassign {
	 
	 public  int addition(int n1, int n2) {
		 
		 return n1+n2;
	 }
		public  int subtraction(int n1, int n2) {
			
			return n1-n2;
			
		}
		
		public static void main (String[] args) {
			
			abstractionassign ab = new abstractassign();
			
			System.out.println(" Addition of Two nos : "+ab.addition(20, 35));
			System.out.println(" Subtraction of Two nos : "+ab.subtraction(32, 20));
			
			
		}

}

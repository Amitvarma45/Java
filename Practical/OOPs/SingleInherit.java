package Corejava;

 class SingleInherit {
	 
	 public void print() {
		 
		 System.out.println("Amit");
		 
	 }
 }
	 
 class singleone extends SingleInherit{
	 
	 public void show() {
		 
		 System.out.println("Varma");
	 }
	
 }
 
 class runmethod {
 

	public static void main(String[] args) {
		
		singleone s= new singleone();
		s.print();
		s.show();
		s.print();
		

	}

}

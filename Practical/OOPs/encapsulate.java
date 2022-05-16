package Corejava;

public class encapsulate {

	public static void main(String[] args) {
		
		//creating object of encapsulation class
		encapsulation e = new encapsulation();
		
		//setting value of variable
		
		e.setName("Amit");
		e.setRollno(12);
		e.setAge(20);
		
		
		//displaying value of variable
		System.out.println("Name : "+e.getName());
		System.out.println("Roll No : "+e.getRollno());
		System.out.println("Age : "+e.getAge());
		
		

	}

}

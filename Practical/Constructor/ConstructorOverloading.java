package Corejava;

public class ConstructorOverloading {
	
	String name;
	double gpa;	

	ConstructorOverloading(String name, double gpa) {
		
		this.name = name;
		this.gpa = gpa;
	}
	
	ConstructorOverloading(String name) {
		
		this.name = name;
	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading(" Amit ",9.6);
		ConstructorOverloading obj1= new ConstructorOverloading(" Amit ");
		System.out.println(" Name : "+obj.name +"\t GPA : "+ obj.gpa);
		System.out.println(" Name : "+obj1.name);
		
		

	}

}

package Corejava;

class ConstructorOverloadingAssign {
	
	//Declaring Variables
	int id;
	String name;
	String address;	
	String Job;
	
	//constructor with three parameters
	ConstructorOverloadingAssign(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	
	}
	
	//constructor with two parameters
	ConstructorOverloadingAssign(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//constructor with four Parameters
	ConstructorOverloadingAssign(int id, String name, String job, String address) {
		
		this.id = id;
		this.name = name;
		this.Job = job;
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloadingAssign obj= new ConstructorOverloadingAssign(2001,"Amit","Rabale");
		ConstructorOverloadingAssign obj1= new ConstructorOverloadingAssign(2001,"Amit");
		ConstructorOverloadingAssign obj2= new ConstructorOverloadingAssign(2001,"Amit","Software Engineer","Rabale");

		System.out.println("ID : "+obj.id+"\t Name : "+obj.name+"\t Addresss : "+obj.address);
		System.out.println("ID : "+obj1.id+"\t Name : "+obj1.name);
		System.out.println("ID : "+obj2.id+"\t Name : "+obj2.name+"\t Job : "+obj2.Job+"\t Addresss : "+obj2.address);
	}

}

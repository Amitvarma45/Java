package Corejava;

class Emp{
	public void emp_name() {
		System.out.println("Amit");
	}
}

class Depart extends Emp{
	public void depart_name() {
		System.out.println("Software Development");
	}
}

class State extends Depart{
	public void state_name() {
		System.out.println("Maharashtra");
	}
}

public class multipleInheritAssign {

	public static void main(String[] args) {
		
		State st= new State();
		st.emp_name();
		st.depart_name();
		st.state_name();
		

	}

}

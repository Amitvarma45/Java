package Corejava;

public class StudentMain {
public static void main(String[] args) {
Student student = new Student();
//setting bean values
student.setId(101);
student.setName("Karthik");
student.setActive(true);
//getting bean value
System.out.println("Student Id : "+student.getId());
System.out.println("Student name : "+student.getName());
System.out.println("Student active : "+student.isActive());
}
}

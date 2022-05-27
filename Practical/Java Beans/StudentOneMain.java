package Corejava;

public class StudentOneMain {
	public static void main(String[] args) {
		StudentOne student = new StudentOne();
		String[] subjects = { "English", "Science", "Computer" };
		// setting bean values
		student.setId(101);
		student.setName("Karthik");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		String[] subjectArray = student.getSubjects();
		for (int i = 0; i < subjectArray.length; i++) {
		System.out.println("Student subject " + (i + 1) + " : " + subjectArray[i]);
		}
		}

}

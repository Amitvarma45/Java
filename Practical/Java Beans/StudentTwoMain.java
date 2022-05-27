package Corejava;

import java.util.ArrayList;
import java.util.List;

public class StudentTwoMain {
	public static void main(String[] args) {
		StudentTwo student = new StudentTwo();
		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Science");
		subjects.add("Computer");
		// setting bean values
		student.setId(101);
		student.setName("Karthik");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		List<String> subjectList = student.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
		System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));
		}
		}
}

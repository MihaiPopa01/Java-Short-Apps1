package homeworkJava_1_18_;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(new Student("Zues", 7));
		student.add(new Student("Abey", 10));
		student.add(new Student("Vignesh", 5));

		for (Student stud : student) {
			stud.showDetails();
		}

		Collections.sort(student, new SortByGrade());

		System.out.println("\nStudents sorted by grade:\n");
		for (Student stud : student) {
			stud.showDetails();
		}

	}
}


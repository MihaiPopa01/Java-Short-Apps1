package homeworkJava_1_6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Address studentAddress = new Address("StudentStreet", "Craiova", 200063);
		Address newStudentAddress = new Address("NewStreet", "Bucharest", 199321);
		Address teacherAddress = new Address("TeacherStreet", "Roma", 301925);
		Address newTeacherAddress = new Address("NewStreet", "Porto", 545822);

		Teacher teacher0 = new Teacher();
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();

		Student student0 = new Student();
		Student student1 = new Student();
		Student student2 = new Student();

		teacher0.setName("Mary");
		teacher0.setAge(41);
		teacher0.setDepartment("D0");
		teacher0.setPersonAddress(teacherAddress);

		teacher1.setName("Daniel");
		teacher1.setAge(42);
		teacher1.setDepartment("D1");
		teacher1.setPersonAddress(teacherAddress);

		teacher2.setName("Alex");
		teacher2.setAge(40);
		teacher2.setDepartment("D2");
		teacher2.setPersonAddress(teacherAddress);

		student0.setName("John");
		student0.setAge(21);
		student0.setSection("Computers");
		student0.setPersonAddress(studentAddress);

		student1.setName("Kane");
		student1.setAge(22);
		student1.setSection("Physics");
		student1.setPersonAddress(studentAddress);

		student2.setName("Ema");
		student2.setAge(20);
		student2.setSection("Informatics");
		student2.setPersonAddress(studentAddress);

		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		/*
		 * Teachers.add(teacher0); 
		 * Teachers.add(teacher1); 
		 * Teachers.add(teacher2);
		 */

		ArrayList<Student> students = new ArrayList<Student>();
		/*
		 * Students.add(student0); 
		 * Students.add(student1); 
		 * Students.add(student2);
		 */
		Course course = new Course(teachers, students);

		course.addTeacherToCourse(teacher0);
		course.addTeacherToCourse(teacher1);
		course.addTeacherToCourse(teacher2);

		course.addStudentToCourse(student0);
		course.addStudentToCourse(student1);
		course.addStudentToCourse(student2);

		for (Teacher teacher : course.getCourseTeachers()) {
			teacher.showDetails();
		}

		for (Student student : course.getCourseStudents()) {
			student.showDetails();
		}

		System.out.println("\n");

		student0.changeStudentAddress(newStudentAddress);
		teacher0.changeTeacherAddress(newTeacherAddress);
		course.removeStudentFromCourse(student1);
		course.removeTeacherFromCourse(teacher1);

		for (Teacher teacher : course.getCourseTeachers()) {
			teacher.showDetails();
		}

		for (Student student : course.getCourseStudents()) {
			student.showDetails();
		}

	}

}

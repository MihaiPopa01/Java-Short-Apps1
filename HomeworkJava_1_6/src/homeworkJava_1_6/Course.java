package homeworkJava_1_6;

import java.util.ArrayList; // import the ArrayList class

public class Course {

	private ArrayList<Teacher> courseTeachers;
	private ArrayList<Student> courseStudents;

	public Course(ArrayList<Teacher> teachers, ArrayList<Student> students) {
		courseTeachers = teachers;
		courseStudents = students;
	}

	public  ArrayList<Teacher> getCourseTeachers() {
		return courseTeachers;
	}

	public void setCourseTeachers(ArrayList<Teacher> courseTeachers) {
		this.courseTeachers = courseTeachers;
	}

	public ArrayList<Student> getCourseStudents() {
		return courseStudents;
	}

	public void setCourseStudents(ArrayList<Student> courseStudents) {
		this.courseStudents = courseStudents;
	}

	public void addStudentToCourse(Student studentToAdd) {
		this.courseStudents.add(studentToAdd);
	}

	public void removeStudentFromCourse(Student studentToRemove) {
		this.courseStudents.remove(studentToRemove);
	}

	public void addTeacherToCourse(Teacher teacherToAdd) {
		this.courseTeachers.add(teacherToAdd);
	}
	
	public void removeTeacherFromCourse(Teacher teacherToRemove) {
		this.courseTeachers.remove(teacherToRemove);
	}
	/*
	public void createNewCourse(ArrayList<Teacher>) {
		ArrayList<Teacher> courseTeachers;
		ArrayList<Student> courseStudents;
	}*/
}

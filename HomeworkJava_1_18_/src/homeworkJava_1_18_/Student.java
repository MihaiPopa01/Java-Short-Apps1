package homeworkJava_1_18_;

public class Student {
	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void showDetails() {
		System.out.println("Student " + name + " has grade " + grade);
	}

}
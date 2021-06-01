package homeworkJava_1_6;

public class Teacher extends Person {

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void showDetails() {
		System.out.println(
				"Teacher " + this.getName() + " is " + this.getAge() + " years old and is part of the department "
						+ this.getDepartment() + " and lives on " + this.getPersonAddress());
	}

	public void changeTeacherAddress(Address newAddress) {
		this.setPersonAddress(newAddress);
	}

}

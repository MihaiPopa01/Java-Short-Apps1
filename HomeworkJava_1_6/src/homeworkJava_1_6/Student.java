package homeworkJava_1_6;

public class Student extends Person {

	private String section;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void showDetails() {
		System.out.println("Student " + this.getName() + " is " + this.getAge() + " years old and studies in section "
				+ this.getSection() + " and lives on " + this.getPersonAddress());
	}

	public void changeStudentAddress(Address newAddress) {
		this.setPersonAddress(newAddress);
	}
}

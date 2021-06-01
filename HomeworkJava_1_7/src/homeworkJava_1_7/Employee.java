package homeworkJava_1_7;

public class Employee extends Person {
	private int monthlySalary;

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	protected void displayEmployeeInformation() {
		this.displayPersonInformation();
		System.out.println("Monthly salary is " + this.monthlySalary);
	}
}

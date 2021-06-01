package homeworkJava_1_7;

import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employees;

	public Company(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public void displayEmployees() {
		for (Employee employee : employees) {
			employee.displayEmployeeInformation();
			System.out.println("");
		}
	}
}

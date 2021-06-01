package homeworkJava_1_7;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Company company = new Company(employees);
		Employee employee0 = new Employee();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Address address0 = new Address("Street", "Craiova", rand.nextInt(999999));
		Address address1 = new Address("Street1", "Iasi", rand.nextInt(999999));
		Address address2 = new Address("Street2", "Bucharest", rand.nextInt(999999));

		employee0.setName("Andrew");
		employee0.setAddress(address0);
		employee0.setMonthlySalary(rand.nextInt(10000));

		employee1.setName("Ana");
		employee1.setAddress(address1);
		employee1.setMonthlySalary(rand.nextInt(10000));

		employee2.setName("Kevin");
		employee2.setAddress(address2);
		employee2.setMonthlySalary(rand.nextInt(10000));

		company.addEmployee(employee0);
		company.addEmployee(employee1);
		company.addEmployee(employee2);

		company.displayEmployees();

	}

}

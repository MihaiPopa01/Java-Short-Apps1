package homeworkJava_1_7;

public class Person {
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayPersonInformation() {
		System.out.println("The name is " + this.name + " and the address is " + this.address);
	}
}

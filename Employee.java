package payroll1;

public abstract class Employee {
	// class variables or properties or attribute
	private String firstName;
	private String lastName;
	//private int salary;
	//private int bonus;
	private int age;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("hey age is ot negative .. i will consider zero");
			this.age = 0;
		}
		
	}

	public abstract int getTotalEarnings();// this must be implemented in a derived class.
	
	public int getBirthYear() {
		return (2022 - this.age);
	}
	
	protected int getTaxes() {
		return (100);
	}
	
	public void displayData() {
		System.out.println("Full Name: " + this.firstName + " " + this.lastName);
		System.out.println("Age");
	}
	
}

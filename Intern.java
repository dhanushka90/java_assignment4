package payroll1;

public class Intern extends Employee {
	
	private String collegeName;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public Intern(String cn) {
		this.collegeName = cn;
	}
	
	@Override
	public int getTotalEarnings() {
		return (1000 - this.getTaxes());
	}	
	
	@Override
	public void displayData() {
		System.out.println("This is an Intern" );
		super.displayData();// invokes the parent class (Employee) display Data
		System.out.println("College Name: " +this.collegeName);
	}
	
}

	

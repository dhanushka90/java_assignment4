package payroll1;

public class FullTime extends Employee{

	private int salary;
	private int bonus;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}



@Override
public int getTotalEarnings() {
	return (this.salary+this.bonus)-this.getTaxes();
}

@Override
public void displayData() {
	System.out.println("This is a Full Time" );
	super.displayData();// invokes the parent class (Employee) display Data
	System.out.println("Salary: " +this.salary);
	System.out.println("Bonus: " +this.bonus);
}

}

package payroll1;

public class PartTime extends Employee{
	
	private int hours;
	private int rate;
	
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	@Override
	public int getTotalEarnings() {
		return (this.hours*this.rate)-this.getTaxes();
	}	
	
	@Override
	public void displayData() {
		System.out.println("This is a Part Time" );
		super.displayData();// invokes the parent class (Employee) display Data
		System.out.println("Hours: " +this.hours);
		System.out.println("Bonus: " +this.rate);
	}
}

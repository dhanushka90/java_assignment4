package payroll1;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		Scanner kbd = new Scanner(System.in);
		
		
		System.out.println("Enter new Employee ? (Y or N)");
		String cont = kbd.next();

		
		// data entry
		while (cont.equals("Y")) {
			
			System.out.println("Type 1 for FT or 2 for PT or 3 for Intern: ");
			int ans = kbd.nextInt();
			
			if (ans ==1) {
				FullTime emp = new FullTime();
				
				System.out.print("First Name: ");
				//emp.firstName = kbd.next(); // "Joe";
				
				String tempFN = kbd.next();
				emp.setFirstName(tempFN);
				
				System.out.print("Last Name: ");
				emp.setLastName(kbd.next()); //"Doe";
				System.out.print("Age: ");
				
				emp.setAge(kbd.nextInt());
				
				System.out.print("Salary: ");
				emp.setSalary(kbd.nextInt());   // 30000;
				System.out.print("Bonus: ");
				emp.setBonus(kbd.nextInt()); // 3000;
				emps.add(emp);
			}
			
			if (ans ==2) {
				PartTime emp = new PartTime();
				
				System.out.print("First Name: ");
				//emp.firstName = kbd.next(); // "Joe";
				
				String tempFN = kbd.next();
				emp.setFirstName(tempFN);
				
				System.out.print("Last Name: ");
				emp.setLastName(kbd.next()); //"Doe";
				System.out.print("Age: ");
				
				emp.setAge(kbd.nextInt());
				
				System.out.print("Hours Worked: ");
				emp.setHours(kbd.nextInt());   // 30000;
				System.out.print("Rate: ");
				emp.setRate(kbd.nextInt()); // 3000;
				emps.add(emp);
			}
			
			if (ans ==3) {
				String colName = "fanshawe";
				Intern emp = new Intern(colName);
				
				System.out.print("First Name: ");
				//emp.firstName = kbd.next(); // "Joe";
				
				String tempFN = kbd.next();
				emp.setFirstName(tempFN);
				
				System.out.print("Last Name: ");
				emp.setLastName(kbd.next()); //"Doe";
				System.out.print("Age: ");
				
				emp.setAge(kbd.nextInt());
				
				System.out.print("College name: ");
				emp.setCollegeName(kbd.next());   // Fanshawe;
				emps.add(emp);
			}
						
			System.out.println("Enter new Employee ? (Y or N)");
			cont = kbd.next();
			
			
		}
		// add employee to the array
		//emps.add(emp1);
		
//		// create employee number 2
//		Employee emp2 = new Employee();
//		emp2.firstName = "Jane";
//		emp2.lastName = "Doe";
//		emp2.salary = 35000;
//		emp2.bonus = 3500;
//		emp2.getTotalEarnings();
		
//		emps.add(emp2);
		
		// using emp1 and emp2
		/*
		System.out.println(emp1.firstName);
		System.out.println(emp1.lastName);
		System.out.println(emp1.salary);
		System.out.println(emp1.bonus);
		System.out.println(emp1.getTotalEarnings());
		System.out.println("----------------");
		System.out.println(emp2.firstName);
		System.out.println(emp2.lastName);
		System.out.println(emp2.salary);
		System.out.println(emp2.bonus);
		System.out.println(emp2.getTotalEarnings());
		*/
		
		//  using the array to display data 
		
		int totalPayroll = 0;
		
		for (int i=0; i<emps.size(); i++) {
			
			emps.get(i).displayData();
			
//			System.out.println("Full Name: " + emps.get(i).getFirstName() + " " + emps.get(i).getLastName());
//			System.out.println("Age: " + emps.get(i).getAge());
			System.out.println("Birth Year: " + emps.get(i).getBirthYear());
//			System.out.println("Salary: " + emps.get(i).getSalary());
//			System.out.println("Bonus: " + emps.get(i).getBonus());
			
			totalPayroll = totalPayroll + emps.get(i).getTotalEarnings();
			
			System.out.println("Total Earnings: " + emps.get(i).getTotalEarnings());
			
			
			System.out.println("----------------");
			
		} // end loop
		System.out.println("Total Payroll: " + totalPayroll);
		
	} // end of main	
} // end of class

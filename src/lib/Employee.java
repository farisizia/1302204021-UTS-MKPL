package lib;

import java.util.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.time.ZoneId;

public class Employee {

		private enum Gender {
			LAKI_LAKI,
			PEREMPUAN
		}
	
	private Gender gender;
	private String idNumber, employeeId,firstName, lastName, address;
	private Date dateJoined;
	private boolean isForeigner;

	private List<String> childIdNumbers;
	private List<String> childNames;

	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address,
	Date dateJoined, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		private LocalDate Joined;
			
		}

		public String EmployeeId() {
			return employeeId;
		}
	
		public String FirstName() {
			return firstName;
		}
	
		public String LastName() {
			return lastName;
		}
	
		public String Num() {
			return idNumber;
		}
	
		public String Address() {
			return address;
		}
	
		public LocalDate getDateJoined() {
			return Joined;
		}
	
		public boolean Foreigner() {
			return isForeigner;
		}
	
	
		public Gender Gender() {
			return gender;
		}


	}

	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
		}else if (grade == 2) {
			monthlySalary = 5000000;
		}else if (grade == 3) {
			monthlySalary = 7000000;
		}
	}
	
	public void addChild(String childIdNumber) {
		childIdNumbers.add(childIdNumber);
		childNames.add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		
		LocalDate currentDate = LocalDate.now();
		LocalDate joinDate = dateJoined.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int monthWorkingInYear;

		if (currentDate.getYear() == joinDate.getYear()) {
			monthWorkingInYear = currentDate.getMonthValue() - joinDate.getMonthValue() + 1;
		} else {
			monthWorkingInYear = 12;		
	}
	
	

	
}

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
	private String idNumber;
	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private Date dateJoined;
	private boolean isForeigner;
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childIdNumbers;
	private List<String> childNames;

	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address,
	Date dateJoined, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;;
		
		this.spouseIdNumber = null;
		childIdNumbers = new LinkedList<String>();
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
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseIdNumber) {
		this.spouseIdNumber = idNumber;
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
	return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible,
				spouseIdNumber == null || spouseIdNumber.equals(""), childIdNumbers.size());
	

	
}

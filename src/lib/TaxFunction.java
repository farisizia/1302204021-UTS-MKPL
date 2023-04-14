package lib;

public class TaxFunction {

	
	
	public static int calculateTax(int Salary, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (Salary - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (Salary - deductible - 54000000));
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}

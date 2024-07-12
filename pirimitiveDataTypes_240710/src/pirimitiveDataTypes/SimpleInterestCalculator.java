package pirimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	//Field
	private BigDecimal principal, interest;
	
	//Constructor
	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}
	
	//Method
	public BigDecimal calculatorTotalValue(int noOfYear) {
		BigDecimal noOfYearBigDecimal = new BigDecimal(noOfYear);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply(noOfYearBigDecimal));
		return totalValue;
	}
	
}
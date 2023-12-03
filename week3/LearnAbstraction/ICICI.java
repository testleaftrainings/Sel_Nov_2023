package week3.LearnAbstraction;

public class ICICI implements RBI ,LoanSec{

	//Multiple Inheritance can be acheived at interface level
	public void kycDocument() {
		System.out.println("3 months salary");

	}
	@Override
	public void rateOfInterrest() {
		System.out.println("11%");
	}

	@Override
	public void cibilScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanDetails() {
		// TODO Auto-generated method stub
		
	}

	

}

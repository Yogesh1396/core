package tnsif.ysb.framework;

public class CurrentAcc extends BankAcc {

	public CurrentAcc(int accNo, String accNum, float accBal) {
		super(accNo, accNum, accBal);
		// TODO Auto-generated constructor stub
	}

	private float CreditLimit ;

	public float getCreditLimit() {
		return CreditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		CreditLimit = creditLimit;
	}
	
}

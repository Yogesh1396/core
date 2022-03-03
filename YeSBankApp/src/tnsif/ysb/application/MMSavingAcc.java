package tnsif.ysb.application;


import tnsif.ysb.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNum, float accBal) {
		super(accNo, accNum, accBal);
		
	}

	@Override
	public void Deposite(float amount) {
		System.out.println("");
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isWithdraw()=" + isWithdraw() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNum()=" + getAccNum() + ", getAccBal()=" + getAccBal() +  "]";
	}
	
	
	
   
}

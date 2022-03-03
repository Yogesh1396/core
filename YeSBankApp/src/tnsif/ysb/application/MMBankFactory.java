package tnsif.ysb.application;

import tnsif.ysb.framework.BankFactory;
import tnsif.ysb.framework.CurrentAcc;
import tnsif.ysb.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNum, float accBal) {
		SavingAcc sa = new SavingAcc(accNo,accNum,accBal);
		return sa;
	}



	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNum, float accBal) {
		CurrentAcc ca = new CurrentAcc(accNo,accNum,accBal);
		return ca;
	}

}

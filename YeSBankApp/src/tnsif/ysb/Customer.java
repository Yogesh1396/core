package tnsif.ysb;

import tnsif.ysb.application.MMBankFactory;
import tnsif.ysb.application.MMSavingAcc;
import tnsif.ysb.framework.BankFactory;
import tnsif.ysb.framework.SavingAcc;

public class Customer {

	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
        SavingAcc sa = new MMSavingAcc(1,"yoog", 10);
        sa.Deposite(0);
	}

}

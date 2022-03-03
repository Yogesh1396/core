package tnsif.ysb.framework;


public class SavingAcc extends BankAcc
{

		 
  public SavingAcc(int accNo, String accNum, float accBal) {
		super(accNo, accNum, accBal);
		// TODO Auto-generated constructor stub
	}




private static boolean isWithdraw= true;

  
  
  
public boolean isWithdraw() {
	return isWithdraw;
}




public void setWithdraw(boolean isWithdraw) {
	this.isWithdraw = isWithdraw;
}




@Override
public String toString() {
	return "SavingAcc [isWithdraw=" + isWithdraw + ", getAccNo()=" + getAccNo() + ", getAccNum()=" + getAccNum()
			+ ", getAccBal()=" + getAccBal() +   "]";
}
  
  
}
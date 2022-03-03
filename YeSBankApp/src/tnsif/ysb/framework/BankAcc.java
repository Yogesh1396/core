package tnsif.ysb.framework;



public class BankAcc {
	private int accNo ;
	private String accNum;
	private float accBal;
	
	
	
	public BankAcc(int accNo, String accNum, float accBal) {
		this.accNo = accNo;
		this.accNum = accNum;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public void Withdraw(float amount)
	{
		System.out.println("THE WITHDRAWAL AMOUNT : ");
	}
	
	public void Deposite (float amount)
	{
		System.out.println("THE DEPOSITE AMOUNT : ");
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNum=" + accNum + ", accBal=" + accBal + "]";
	}
	
}
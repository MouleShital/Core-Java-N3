package org.tnsif.framework;

public abstract class BankAcc {

	//data members
	private int accNo;
	private String accName;
	private float accBal;
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	//parameterized constructor
	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
	abstract void withdraw(float accBal);
	public void deposite(float accBal) 
	{
		System.out.println(accBal);
	}
	
	
	
}

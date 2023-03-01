package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalary;
	private static final float minBal = 0;
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal)
	{
		System.out.println("Acc no:" + this.getAccNo()+ " " + "Acc name:" + this.getAccName()+ " "+ "Account Bal:" + this.getAccBal());
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	
	
}

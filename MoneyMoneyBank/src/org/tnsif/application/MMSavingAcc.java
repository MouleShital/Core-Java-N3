package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	private static float minBal;
	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal, isSalary);
		
	}
	
//	public void withdraw(float accBal) {
//		System.out.println("Acc no:" + this.getAccNo()+ " " + "Acc name:" + this.getAccName()+ " "+ "Account Bal:" + this.getAccBal());
//	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
}

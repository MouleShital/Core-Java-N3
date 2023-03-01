package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalary) {
		MMSavingAcc s = new MMSavingAcc(accNo, accName, accBal, isSalary);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(accNo, accName, accBal, creditLimit);
		return c;
	}

}

package org.tnsif.framework;

public abstract class BankFactory {

	//abstract method
	public abstract SavingAcc getNewSavingAcc(int accNo, String accName, float accBal, boolean isSalary);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float creditLimit);

}

package org.tnsif.application;

import org.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
}

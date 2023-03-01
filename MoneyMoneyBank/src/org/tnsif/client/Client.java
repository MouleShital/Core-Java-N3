package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(1231, "Shital", 2000, true);
		MMCurrentAcc c = new MMCurrentAcc(1232, "Shital M", 3950, 20.0f);
		
		//Saving Account
		System.out.println("Saving Account");
		System.out.println(s);
		System.out.println(s.getAccBal());
		
		//Current Account
		System.out.println("Current Account");
		System.out.println(c);
		System.out.println(c.getAccBal());
	
	}

}

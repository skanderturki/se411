package edu.psu.se411.ch05.threads;

import edu.psu.se411.ch05.accounts.BankAccount;

public class AddBalanceThread implements Runnable {
	
	private BankAccount account;
	
	public AddBalanceThread(BankAccount account_p) {
		this.account = account_p;
	}
	
    public void run() {
      account.deposit(1);
    }
    
}
package edu.psu.se411.ch05.accounts;

public class BankAccount {
	
  private int balance;

  public BankAccount(int balance_p) {
	  this.balance = balance_p;
  }
  
  public BankAccount() {
	  this.balance = 0;
  }
  
  
  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    int newBalance = balance + amount;

    // This delay is deliberately added to magnify the
    // data-corruption problem and make it easy to see.
    try {
      Thread.sleep(5);
    }
    catch (InterruptedException ex) {
    }

    balance = newBalance;
  }
  
  @Override
  public String toString() {
	  return String.format("Account balance: %d%n", this.getBalance());
  }
}
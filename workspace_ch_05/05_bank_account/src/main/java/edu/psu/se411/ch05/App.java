package edu.psu.se411.ch05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	private static Account account = new Account();

	  public static void main(String[] args) {
	    ExecutorService executor = Executors.newCachedThreadPool();

	    // Create and launch 100 threads
	    for (int i = 0; i < 200; i++) {
	      executor.execute(new AddAPennyTask());
	    }

	    executor.shutdown();

	    // Wait until all tasks are finished
	    while (!executor.isTerminated()) {
	    }

	    System.out.println("What is balance? " + account.getBalance());
	  }

	  // A thread for adding a penny to the account
	  private static class AddAPennyTask implements Runnable {
	    public void run() {
	      account.deposit(1);
	    }
	  }

	  // An inner class for account
	  private static class Account {
	    private int balance = 0;

	    public int getBalance() {
	      return balance;
	    }

	    public synchronized void deposit(int amount) {
	      System.out.println("Depositing...");
	      int newBalance = balance + amount;

	      // This delay is deliberately added to magnify the
	      // data-corruption problem and make it easy to see.
	      try {
	        Thread.sleep(1);
	      }
	      catch (InterruptedException ex) {
	      }

	      balance = newBalance;
	    }
	  }
	}
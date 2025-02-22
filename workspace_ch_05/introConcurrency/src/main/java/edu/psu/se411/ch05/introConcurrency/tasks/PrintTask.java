package edu.psu.se411.ch05.introConcurrency.tasks;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

	// SecureRandom provides a cryptographically strong random number generator.
	private static final SecureRandom generator = new SecureRandom();
	private final int sleepTime;
	private final String taskName;
	
	public PrintTask(String taskName) {
		this.taskName = taskName;
		this.sleepTime = this.generator.nextInt(50000);
	}
	
	@Override
	public void run() {
		try {
			System.out.printf("%s task is going to sleep for %d milliseconds.%n", this.taskName, this.sleepTime);
			Thread.sleep(this.sleepTime);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		System.out.printf("%s task is done sleeping.%n", this.taskName);
	}

}

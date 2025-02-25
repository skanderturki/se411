package edu.psu.se411.ch05.threads;

public class AdditionThread implements Runnable {
	
	private int counter = 1;
	private String threadId;
	private int frequency;
	
	public AdditionThread(String id_p, int frequency_p) {
		this.frequency = frequency_p;
		this.threadId = id_p;
	}

	@Override
	public void run() {
		while(counter < 200) {
			try {
				counter++;
				System.out.printf("Thread %s was Added to count %d%n", getThreadId(), getCounter());
				if(counter  == 50) Thread.yield();
				Thread.sleep(1000 / frequency);
		    } catch (InterruptedException e) {
				System.out.printf("Thread %s was interreupted at count %d%n", getThreadId(), getCounter());
			}

		}

	}

	public int getCounter() {
		return counter;
	}
	
	public String getThreadId() {
		return this.threadId;
	}
}

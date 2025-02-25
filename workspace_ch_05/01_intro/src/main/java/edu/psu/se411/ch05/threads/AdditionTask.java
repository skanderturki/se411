package edu.psu.se411.ch05.threads;

public class AdditionTask implements Runnable {
	
	private int counter = 1;
	private String threadId;
	private int frequency;
	
	public AdditionTask(String id_p, int frequency_p) {
		this.frequency = frequency_p;
		this.threadId = id_p;
	}

	@Override
	public void run() {
		while(counter < 200) {
			try {
				counter++;
				System.out.printf("Task %s added 1 and now count is %d%n", getThreadId(), getCounter());
				if(counter  == 50) Thread.yield();
				Thread.sleep(1000 / frequency);
		    } catch (InterruptedException e) {
				System.out.printf("Task %s was interrupted at count %d%n", getThreadId(), getCounter());
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

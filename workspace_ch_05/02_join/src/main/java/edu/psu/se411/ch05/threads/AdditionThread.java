package edu.psu.se411.ch05.threads;

public class AdditionThread implements Runnable {
	
	private int counter;
	private String threadId;
	private int frequency;
	
	public AdditionThread(String id_p, int frequency_p) {
		this.frequency = frequency_p;
		this.threadId = id_p;
	}

	@Override
	public void run() {
		Thread threadC = new Thread(new CountingThread(this.threadId + "_#_thread_C", 10));
		threadC.start();
		while(counter < 10) {
			try {
				threadC.join(); // without waiting for thread C, the outputs would be interleaved
				// but with the join, this thread will wait until threadC finishes before proceeding
				counter++;
				System.out.printf("Thread %s was Added to count %d%n", getThreadId(), getCounter());
			} catch (InterruptedException e) {
				e.printStackTrace();
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

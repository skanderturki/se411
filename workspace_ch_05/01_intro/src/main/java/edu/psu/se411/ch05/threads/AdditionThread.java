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
		Thread threadC = new Thread(new AdditionThread(this.threadId + "_#_thread_C", frequency));
		threadC.start();
		while(true) {
			counter++;
			System.out.printf("Thread %s was Added to count %d%n", getThreadId(), getCounter());
			
			try {
				Thread.sleep(1000 / frequency);
				if(counter == 50) threadC.join();
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

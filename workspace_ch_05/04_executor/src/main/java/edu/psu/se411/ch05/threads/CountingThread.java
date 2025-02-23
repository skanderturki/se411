package edu.psu.se411.ch05.threads;

public class CountingThread implements Runnable {
	
	private int count;
	private String threadId;
	private int frequency;
	
	public CountingThread(String id_p, int count_p, int frequency_p) {
		this.count = count_p;
		this.threadId = id_p;
		this.frequency = frequency_p;
	}

	@Override
	public void run() {
		try {
			while(count > 0) {
				count--;
				Thread.sleep(1000 / this.frequency);
				System.out.printf("Thread %s was Added to count %d%n", getThreadId(), getCount());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getCount() {
		return count;
	}
	
	public String getThreadId() {
		return this.threadId;
	}
}

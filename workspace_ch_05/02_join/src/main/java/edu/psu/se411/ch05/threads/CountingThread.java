package edu.psu.se411.ch05.threads;

public class CountingThread implements Runnable {
	
	private int count;
	private String threadId;
	
	public CountingThread(String id_p, int count_p) {
		this.count = count_p;
		this.threadId = id_p;
	}

	@Override
	public void run() {
		while(count > 0) {
			count--;
			System.out.printf("Thread %s was Added to count %d%n", getThreadId(), getCount());
		}
		
	}

	public int getCount() {
		return count;
	}
	
	public String getThreadId() {
		return this.threadId;
	}
}

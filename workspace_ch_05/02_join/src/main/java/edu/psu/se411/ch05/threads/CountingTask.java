package edu.psu.se411.ch05.threads;

public class CountingTask implements Runnable {
	
	private int count;
	private String taskId;
	
	public CountingTask(String id_p, int count_p) {
		this.count = count_p;
		this.taskId = id_p;
	}

	@Override
	public void run() {
		while(count > 0) {
			count--;
			System.out.printf("Task %s retrieved 1 and now count is %d%n", getTaskId(), getCount());
		}
		
	}

	public int getCount() {
		return count;
	}
	
	public String getTaskId() {
		return this.taskId;
	}
}

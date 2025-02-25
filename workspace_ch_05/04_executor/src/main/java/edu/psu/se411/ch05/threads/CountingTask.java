package edu.psu.se411.ch05.threads;

public class CountingTask implements Runnable {
	
	private int count;
	private String taskId;
	private int frequency;
	
	public CountingTask(String id_p, int count_p, int frequency_p) {
		this.count = count_p;
		this.taskId = id_p;
		this.frequency = frequency_p;
	}

	@Override
	public void run() {
		try {
			while(count > 0) {
				count--;
				Thread.sleep(1000 / this.frequency);
				System.out.printf("Task %s retrieved 1 and now count is %d%n", getTaskId(), getCount());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getCount() {
		return count;
	}
	
	public String getTaskId() {
		return this.taskId;
	}
}

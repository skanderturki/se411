package edu.psu.se411.ch05.threads;

public class AdditionTask implements Runnable {
	
	private int counter;
	private String taskId;
	
	public AdditionTask(String id_p) {
		this.taskId = id_p;
	}

	@Override
	public void run() {
		Thread threadC = new Thread(new CountingTask(this.taskId + "_#_task_C", 10));
		threadC.start();
		while(counter < 10) {
			try {
				threadC.join(); // without waiting for thread C, the outputs would be interleaved
				// but with the join, this thread will wait until threadC finishes before proceeding
				counter++;
				System.out.printf("Task %s Added 1 and now count is %d%n", getTaskId(), getCounter());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public int getCounter() {
		return counter;
	}
	
	public String getTaskId() {
		return this.taskId;
	}
}

package edu.psu.se411.ch05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.ch05.threads.CountingTask;


public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application is starting...");

		ExecutorService executor = Executors.newFixedThreadPool(3);

	    for(int i = 0; i < 20; i++) {
			CountingTask countingTask = new CountingTask("Task_" + i, 10, 20);		
			Thread thread = new Thread(countingTask);
			
			// Submit runnable tasks to the executor
			executor.execute(thread);
		}

	    // Shut down the executor
	    executor.shutdown();
		
		logger.info("Application is closing...");
	}

}

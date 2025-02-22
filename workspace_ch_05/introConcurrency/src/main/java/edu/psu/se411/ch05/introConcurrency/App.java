package edu.psu.se411.ch05.introConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.ch05.introConcurrency.tasks.PrintTask;

public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application is starting...");

		PrintTask taskA = new PrintTask("TaskA");
		PrintTask taskB = new PrintTask("TaskB");
		PrintTask taskC = new PrintTask("TaskC");
		
		System.out.println("Starting tasks...");
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(taskA);
		executor.execute(taskB);
		executor.execute(taskC);
		
		executor.shutdown();
		
		logger.info("Application is stopping...");
	}

}

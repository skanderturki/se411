package edu.psu.se411.ch05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.ch05.threads.AdditionTask;


public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application is starting...");

		AdditionTask addTaskA = new AdditionTask("Task_A");		
		
		Thread thread_A = new Thread(addTaskA);
		
		thread_A.start();
		
		logger.info("Application is closing...");
	}

}

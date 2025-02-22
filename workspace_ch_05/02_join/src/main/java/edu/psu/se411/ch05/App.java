package edu.psu.se411.ch05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.ch05.threads.AdditionThread;


public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application is starting...");

		AdditionThread addThreadA = new AdditionThread("Thread_A", 20);		
		
		Thread thread_A = new Thread(addThreadA);
		
		thread_A.start();
		
		logger.info("Application is closing...");
	}

}

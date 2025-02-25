package edu.psu.se411.ch05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.ch05.threads.AdditionTask;


public class App {
	
	static Logger logger =  LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Application is starting...");

		AdditionTask addThreadA = new AdditionTask("Task_A", 20);		
		AdditionTask addThreadB = new AdditionTask("Task_B", 20);
		
		Thread thread_A = new Thread(addThreadA);
		thread_A.setPriority(10);
		
		Thread thread_B = new Thread(addThreadB);
		thread_B.setPriority(1);
		
		thread_A.start();
		thread_B.start();
		
		logger.info("Application is closing...");
	}

}

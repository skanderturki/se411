package edu.psu.se411.ch05.callpython;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	static Logger logger =  LoggerFactory.getLogger(App.class);
	
	
	
	public static void main(String[] args) {
		logger.info("Application is starting...");
		
		// Calling external python script in a separate thread
		try {
//			String script = "./scripts/test02.py";
//			String pipeline = "sentiment-analysis";
//			String prompt = "this guy is so ugly";
			
			String script = "./scripts/test02.py";
			String pipeline = AIUtils.TEXT_GENERATION;
			String prompt = "I want to travel to";
			
			ProcessBuilder builder = new ProcessBuilder("python", script, pipeline, prompt); // 89 is the first argument
			Process process = builder.start();	
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader error_reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			
			
			String lines = null;
			while((lines = reader.readLine()) != null) {
				System.out.println("lines: " + lines);
			}
			
			String error_lines = null;
			while((error_lines = error_reader.readLine()) != null) {
				System.out.println("error_lines: " + error_lines);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex.getMessage());
		}
		
		logger.info("Application is stopping...");
	}

}

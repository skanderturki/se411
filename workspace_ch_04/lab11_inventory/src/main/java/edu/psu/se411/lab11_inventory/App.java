package edu.psu.se411.lab11_inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.lab11_inventory.model.Book;
import edu.psu.se411.lab11_inventory.model.ElectronicDevice;
import edu.psu.se411.lab11_inventory.model.Inventory;
import edu.psu.se411.lab11_inventory.model.Item;

public class App {

	static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.info("Application is starting...");
		
		Inventory<Item> inventory = new Inventory<Item>();
		inventory.add( new Book("B001", "Concurrency in Java", "Salah Obeid") );
		inventory.add( new Book("B002", "Mastering JavaScript", "Ahmed Althunayen") );
		inventory.add( new ElectronicDevice("M001", "USB drive 256Gb", "Toshiba"));
		inventory.add( new ElectronicDevice("M002", "3D printer 4526", "Sony"));
		
		System.out.println(inventory);
		
		logger.info("Application is closing...");
	}

}
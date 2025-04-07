package edu.psu.se411.lab12_comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.lab12_comparable.model.Item;
import edu.psu.se411.lab12_comparable.model.Order;

public class App {

	static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.info("Application is starting...");
		
		List<Order> orders = new ArrayList<>();
		orders.add(new Order("A102", "Salah", LocalDate.of(2025, 2, 10), new Item[] {
				new Item("I002", "Screen", "A 43 inch screen"),
				new Item("I003", "Mouse", "An optical mouse")
		}));
		orders.add(new Order("A101", "Ayman", LocalDate.of(2025, 2, 8), new Item[] {
				new Item("I007", "Keyboard", "A gaming keyboard"),
				new Item("I009", "Mouse", "An optical mouse")
		}));
		orders.add(new Order("A103", "Ramzi", LocalDate.of(2025, 1, 22), new Item[] {
				new Item("I034", "Pen", "A blue pen"),
				new Item("I056", "Printer", "A laser printer")
		}));

		Collections.sort(orders);
		System.out.println("The sorted orders:");
		for(int i = 0; i< orders.size(); i++) {
			System.out.println(orders.get(i));
		};
		
		Order newOrder = orders.get(0).clone();
		System.out.printf("The new clone: %n%s%n", newOrder);
		
		
		logger.info("Application is closing...");
	}

}


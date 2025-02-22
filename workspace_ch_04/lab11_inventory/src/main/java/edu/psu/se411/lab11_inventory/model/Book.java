package edu.psu.se411.lab11_inventory.model;

public class Book extends Item {
	
	private String authorName;

	public Book(String id, String name, String authorName) {
		super(id, name);
		this.authorName = authorName;
	}

}

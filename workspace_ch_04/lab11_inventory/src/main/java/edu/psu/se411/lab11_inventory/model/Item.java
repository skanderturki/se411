package edu.psu.se411.lab11_inventory.model;

public abstract class Item {
	
	private String id;
	private String name;
	
	public Item(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("Item: (id: %s, name: %s%n", getId(), getName());
	}

	
}

package edu.psu.se411.lab11_inventory.model;

public class ElectronicDevice extends Item {
	
	private String brand;

	public ElectronicDevice(String id, String name, String brand) {
		super(id, name);
		this.brand = brand;
	}

}
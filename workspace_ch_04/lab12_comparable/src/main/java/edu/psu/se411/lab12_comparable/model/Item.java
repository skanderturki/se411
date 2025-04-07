package edu.psu.se411.lab12_comparable.model;

public class Item implements Cloneable {


	private String id;
	private String name;
	private String description;
	
	
	public Item(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	@Override
	public Item clone() {
		return new Item(new String(getId())
				, new String(getName())
				, new String(getDescription()));
	}
	
	@Override
	public String toString() {
		return String.format("Item: %s %s (%s)", getId(), getName(), getDescription());
	}
	

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

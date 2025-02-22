package edu.psu.se411.lab11_inventory.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {

	private List<T> elements;
	
	public Inventory() {
		setElements(new ArrayList<T>());
	}
	
	public Inventory(List<T> elements) {
		this.elements = elements;
	}

	public List<T> getElements() {
		return elements;
	}

	private void setElements(List<T> elements) {
		this.elements = elements;
	}
	
	public void add(T element) {
		getElements().add(element);
	}
	
	public boolean remove(T element) {
		return getElements().remove(element);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(String.format("Inventory:%n"));
		for(T element: getElements()) {
			result.append(element);
		}
		
		return result.toString();
	}
	
}

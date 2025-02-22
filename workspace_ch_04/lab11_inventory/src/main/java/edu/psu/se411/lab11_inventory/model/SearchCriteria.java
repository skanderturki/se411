package edu.psu.se411.lab11_inventory.model;

public interface SearchCriteria<T> {

	public abstract boolean check(T element);
	
}

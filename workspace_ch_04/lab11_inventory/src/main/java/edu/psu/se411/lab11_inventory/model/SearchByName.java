package edu.psu.se411.lab11_inventory.model;

public class SearchByName implements SearchCriteria<Item> {

	private String nameCriteria;
	
	public SearchByName(String nameCriteria) {
		this.nameCriteria = nameCriteria;
	}

	@Override
	public boolean check(Item element) {
		// TODO Auto-generated method stub
		return nameCriteria.equals(element.getName());
	}



}

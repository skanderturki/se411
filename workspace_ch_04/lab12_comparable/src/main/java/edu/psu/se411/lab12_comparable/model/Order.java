package edu.psu.se411.lab12_comparable.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class Order implements Comparable<Order>, Cloneable {

	private String orderId;
	private String customerName;
	private LocalDate deliveryDate;
	private Item[] orderedItems;
    
	public Order(String orderId, String customerName, LocalDate deliveryDate, Item[] orderedItems) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryDate = deliveryDate;
		this.orderedItems = orderedItems;
	}

	@Override
	public Order clone() {
		String newId = UUID.randomUUID().toString();
		LocalDate newDate = LocalDate.of(this.getDeliveryDate().getYear()
				, this.getDeliveryDate().getMonthValue()
				, this.getDeliveryDate().getDayOfMonth());
		Item[] newItems = new Item[this.getOrderedItems().length];
		for(int i = 0; i < getOrderedItems().length; i++) {
			newItems[i] = getOrderedItems()[i].clone();
		}
		return new Order(newId, new String(this.getCustomerName())
				, newDate, newItems);
	}

	@Override
	public int compareTo(Order o) {
		int datesComparison = this.getDeliveryDate().compareTo(o.getDeliveryDate());
		if(datesComparison == 0) {
			return this.getOrderId().compareTo(o.getOrderId());
		}
		return datesComparison;
	}
	
	@Override
  public String toString() {
		return "Order{" +
							"orderId='" + orderId + '\'' +
							", customerName='" + customerName + '\'' +
							", deliveryDate=" + deliveryDate + '\'' +
							", items=" + Arrays.toString(orderedItems) +
							'}';
  }
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Item[] getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(Item[] orderedItems) {
		this.orderedItems = orderedItems;
	}


}

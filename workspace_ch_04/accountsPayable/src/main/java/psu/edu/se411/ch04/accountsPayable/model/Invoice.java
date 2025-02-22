package psu.edu.se411.ch04.accountsPayable.model;

import psu.edu.se411.cho4.accountsPayable.exceptions.InvalidArgumentException;

public class Invoice implements Payable {

	private final String productName;
	private final Double unitPrice;
	private final Integer quantity;
	
	public Invoice(String productName_p, Double unitPrice_p
			, Integer quantity_p) throws InvalidArgumentException {
		this.productName = productName_p;
		
		if (unitPrice_p < 0.0) {
			throw new InvalidArgumentException("Unit price cannot be negative");
		}
		if (quantity_p < 0) {
			throw new InvalidArgumentException("Quantity cannot be negative");
		}
		
		this.unitPrice = unitPrice_p;
		this.quantity = quantity_p;
	}
	
	public Double getPaymentAmount() {
		return getUnitPrice() * getQuantity();
	}
	
	@Override
	public String toString() {
		return String.format("Invoice: %s%nUnit price: %.2f%nQuantity: %.2f"
				, getProductName(), getUnitPrice(), getQuantity());
	}
	
	public String getProductName() {
		return productName;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

}

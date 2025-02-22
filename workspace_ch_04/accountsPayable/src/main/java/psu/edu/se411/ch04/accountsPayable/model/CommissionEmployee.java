package psu.edu.se411.ch04.accountsPayable.model;

import psu.edu.se411.cho4.accountsPayable.exceptions.InvalidArgumentException;

public class CommissionEmployee extends Employee {

	private Double commissionRate;
	private Double grossSales;
	
	public CommissionEmployee(String id_p, String fname_p, String lname_p,
			Double commissionRate_p, Double grossSales_p) throws InvalidArgumentException {
		super(id_p, fname_p, lname_p);
		if (commissionRate_p < 0.0) {
			throw new InvalidArgumentException("Commission rate cannot be negative");
		}
		if (grossSales_p < 0.0) {
			throw new InvalidArgumentException("Gross sales cannot be negative");
		}
		
		this.commissionRate = commissionRate_p;
		this.grossSales = grossSales_p;
	}
	
	@Override
	public Double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	@Override
	public String toString() {
		return String.format("Commission employee: %n%s%nCommission rate: %.2f%%%nGross sales: %.2f"
				, super.toString(), getCommissionRate(), getGrossSales());
	}
	
	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate_p) throws InvalidArgumentException {
		if (commissionRate_p < 0.0) {
			throw new InvalidArgumentException("Commission rate cannot be negative");
		}
		if (commissionRate_p > 1.0) {
			throw new InvalidArgumentException("Commission rate cannot be more than 1");
		}
		this.commissionRate = commissionRate_p;
	}

	public Double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(Double grossSales_p) throws InvalidArgumentException {
		if (grossSales_p < 0.0) {
			throw new InvalidArgumentException("Gross sales cannot be negative");
		}
		this.grossSales = grossSales_p;
	}





}

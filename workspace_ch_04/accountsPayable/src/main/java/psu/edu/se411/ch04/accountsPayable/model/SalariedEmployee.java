package psu.edu.se411.ch04.accountsPayable.model;

import psu.edu.se411.cho4.accountsPayable.exceptions.InvalidArgumentException;

public class SalariedEmployee extends Employee {

	private Double monthlySalary;

	public SalariedEmployee(String id_p, String fname_p, String lname_p, Double monthlySalary_p)
			throws InvalidArgumentException {
		super(id_p, fname_p, lname_p);
		
		if (monthlySalary_p < 0.0) {
			throw new InvalidArgumentException("Salary cannot be negative");
		}
		
		this.monthlySalary = monthlySalary_p;
	}

	@Override
	public Double earnings() {
		return getMonthlySalary();
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary_p) throws InvalidArgumentException {
		if (monthlySalary_p < 0.0) {
			throw new InvalidArgumentException("Salary cannot be negative");
		}
		
		this.monthlySalary = monthlySalary_p;
	}

	@Override
	public String toString() {
		return String.format("Salaried employee: %n%s%nSalary: %.2fSAR", super.toString(), getMonthlySalary());
	}
}

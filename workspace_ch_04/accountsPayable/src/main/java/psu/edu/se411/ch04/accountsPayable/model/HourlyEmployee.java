package psu.edu.se411.ch04.accountsPayable.model;

import psu.edu.se411.cho4.accountsPayable.exceptions.InvalidArgumentException;

public class HourlyEmployee extends Employee {

	private Double hourlyRate;
	private Double workedHours;
	
	public HourlyEmployee(String id_p, String fname_p, String lname_p
			, Double hourlyRate_p, Double workedHours_p) throws InvalidArgumentException {
		super(id_p, fname_p, lname_p);
		if (hourlyRate_p < 0.0) {
			throw new InvalidArgumentException("Hourly rate cannot be negative");
		}
		if (workedHours_p < 0.0) {
			throw new InvalidArgumentException("Worked hours cannot be negative");
		}
		this.hourlyRate = hourlyRate_p;
		this.workedHours = workedHours_p;
	}

	
	@Override
	public Double earnings() {
		if(getWorkedHours() <= 40)
			return getHourlyRate() * getWorkedHours();
		return 40 * getHourlyRate() +  (getWorkedHours() - 40) * getHourlyRate() * 1.5;
	}

	@Override
	public String toString() {
		return String.format("Hourly employee: %n%s%nHourly rate: %.2fSAR%nWorked hours: %.2f"
				, super.toString(), getHourlyRate(), getWorkedHours());
	}
	
	public Double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(Double hourlyRate_p) throws InvalidArgumentException {
		if (hourlyRate_p < 0.0) {
			throw new InvalidArgumentException("Hourly rate cannot be negative");
		}
		this.hourlyRate = hourlyRate_p;
	}


	public Double getWorkedHours() {
		return workedHours;
	}


	public void setWorkedHours(Double workedHours_p) throws InvalidArgumentException {
		if (workedHours_p < 0.0) {
			throw new InvalidArgumentException("Worked hours cannot be negative");
		}
		this.workedHours = workedHours_p;
	}
}

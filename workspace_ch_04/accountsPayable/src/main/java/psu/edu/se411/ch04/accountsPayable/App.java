package psu.edu.se411.ch04.accountsPayable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import psu.edu.se411.ch04.accountsPayable.model.CommissionEmployee;
import psu.edu.se411.ch04.accountsPayable.model.Employee;
import psu.edu.se411.ch04.accountsPayable.model.HourlyEmployee;
import psu.edu.se411.ch04.accountsPayable.model.SalariedEmployee;
import psu.edu.se411.cho4.accountsPayable.exceptions.InvalidArgumentException;

public class App {

	static Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.info("Application starting...");
		
		try {
			Employee[] employees = new Employee[] {
					new SalariedEmployee("EMP_001", "Salah", "Obeid", 15200.0),
					new CommissionEmployee("EMP_002", "Ali", "Otaibi", 0.15, 56200.0),
					new SalariedEmployee("EMP_003", "Ramzi", "Obeikan", 21500.0),
					new HourlyEmployee("EMP_004", "Ahmed", "Slimani", 30.0, 160.0)
			};
			
			for(Employee e: employees ) {
				System.out.printf("%s%nEarnings: %.2fSAR%n%n",e.toString(), e.earnings());
			}
		} catch (InvalidArgumentException ex) {
			logger.error(ex.getMessage());
		}
		
		logger.info("Application closing...");
	}

}

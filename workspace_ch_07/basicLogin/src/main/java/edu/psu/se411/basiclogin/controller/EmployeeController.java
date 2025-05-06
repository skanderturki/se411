package edu.psu.se411.basiclogin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.psu.se411.basiclogin.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	private List<Employee> employees = new ArrayList<>(List.of(
			new Employee(5, "Salah", "Obeid"),
			new Employee(5, "Omar", "Abed"),
			new Employee(5, "Ahmed", "Qurashi")));

	@GetMapping()
	public List<Employee> getEmployees() {
		return employees;
	}

	@PostMapping()
	public Employee addEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		return employee;
	}

}

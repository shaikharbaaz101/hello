package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmpApi {

	private static List<Employee> employeesRepo = new ArrayList<>();

	static {
		employeesRepo.add(new Employee(1, "salman"));
		employeesRepo.add(new Employee(2, "saohail"));
		employeesRepo.add(new Employee(3, "sayyed"));
	}

	@GetMapping("/info")
	public String getMessage() {
		return "sohail";
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {

//		Employee e1 = new Employee(1, "sohail");
//		return e1;	
		return employeesRepo.get(id);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
//		List <Employee> employees = new ArrayList<>();
//		employees.add(new Employee(1,"salman"));
//		employees.add(new Employee(2,"saohail"));
//		employees.add(new Employee(3,"sayyed"));
//		return employees;

		return employeesRepo;

	}
	
	@PostMapping("/createemp")
	public boolean createEmp(@RequestBody Employee e) {
		
		return employeesRepo.add(e);
		
	}
	/*
	 * @PutMapping("/update/{id}") public Employee updateEmp(@RequestBody Employee
	 * e) { int x= e.getId(); if (x==0) { System.out.println("not an entry"); } else
	 * { return employeesRepo.get(e.setName("sohail"); }
	 */
	
	@DeleteMapping("/delete/{id}")
		public Employee deleteEmployeeById(@PathVariable int id) {
			
		
		return employeesRepo.remove(id);
		}
		
	
	}



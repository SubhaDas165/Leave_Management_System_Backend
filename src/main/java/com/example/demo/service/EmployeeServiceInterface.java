package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeDetails;

public interface EmployeeServiceInterface {
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails);
	public List<EmployeeDetails> getAllEmployeeDetails();
	public EmployeeDetails getEmployeeByID(Integer id);
	public String deleteEmployeeById(Integer id);
	public EmployeeDetails editEmployeeDetails(EmployeeDetails employeeDetails, Integer id);
	

}

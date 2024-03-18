package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeServiceInterface;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeManagementController {
	
	@Autowired
	private EmployeeServiceInterface empService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployeeDeatils(@RequestBody EmployeeDetails employeeDetails){
		return new ResponseEntity<>(empService.saveEmployeeDetails(employeeDetails),HttpStatus.CREATED);
	}
	@GetMapping("/allEmployees")
	public ResponseEntity<?> getAllEmployeeDetails(){
		return new ResponseEntity<>(empService.getAllEmployeeDetails(),HttpStatus.OK);
	}
	@GetMapping("/serchEmployee/{id}")
	public ResponseEntity<?> getEmployeeByID(@PathVariable Integer id){
		return new ResponseEntity<>(empService.getEmployeeByID(id),HttpStatus.OK);
	}
	@GetMapping("/deleteEmployee/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable Integer id){
		return new ResponseEntity<>(empService.deleteEmployeeById(id),HttpStatus.OK);
	}

}

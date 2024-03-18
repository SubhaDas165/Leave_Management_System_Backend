package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.repoInterface.LeaveManagementRepository;

@Service
public class EmployeeServiceImplement implements EmployeeServiceInterface {
	
	@Autowired
	private LeaveManagementRepository leaveRepo;
	
	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		return leaveRepo.save(employeeDetails);
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return leaveRepo.findAll();
	}

	@Override
	public EmployeeDetails getEmployeeByID(Integer id) {
		// TODO Auto-generated method stub
		return leaveRepo.findById(id).get();
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		EmployeeDetails employeeDetails=leaveRepo.findById(id).get();
		if(employeeDetails!=null) {
			leaveRepo.delete(employeeDetails);
			return "EmloyeeDeatils Deleted Succefully for Employee ID: "+id;
		}
		return "Something Wrong on server";
	}

	@Override
	public EmployeeDetails editEmployeeDetails(EmployeeDetails employeeDetails, Integer id) {
		// TODO Auto-generated method stub
		EmployeeDetails empDetails=leaveRepo.findById(id).get();
		empDetails.setDesignation(employeeDetails.getDesignation());
		empDetails.setMangerName(employeeDetails.getMangerName());
		empDetails.setFirstName(employeeDetails.getFirstName());
		empDetails.setLastName(empDetails.getLastName());
		return leaveRepo.save(empDetails);
	}
	

}

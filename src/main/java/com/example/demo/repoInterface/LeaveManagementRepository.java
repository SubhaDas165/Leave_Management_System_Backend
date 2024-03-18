package com.example.demo.repoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeDetails;

public interface LeaveManagementRepository extends JpaRepository<EmployeeDetails,Integer > {

}

package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.Employee;

public interface EmployeeRepository extends CrudRepository< Employee, String>{ 

}

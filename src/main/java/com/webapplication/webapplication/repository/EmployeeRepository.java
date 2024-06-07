package com.webapplication.webapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.webapplication.webapplication.model.Employee;

@EnableJpaRepositories
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
	
}

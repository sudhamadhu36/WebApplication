package com.webapplication.webapplication.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="department")
	private String department;
	
	public Employee(String empName, String sex, long salary, String department) {
		this.empName = empName;
		this.sex = sex;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex= sex;
	}

	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}

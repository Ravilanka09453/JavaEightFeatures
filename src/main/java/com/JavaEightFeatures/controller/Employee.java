package com.JavaEightFeatures.controller;

import java.util.List;

public class Employee {
	
	private int empId;
	private String empName;
	private List<String> empSkill;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpSkill() {
		return empSkill;
	}
	public void setEmpSkill(List<String> empSkill) {
		this.empSkill = empSkill;
	}
	public Employee(int empId, String empName, List<String> empSkill) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSkill = empSkill;
	}
	
	
	
	

}

package com.project.Employess;

public class Employee 
{
	private int empId;
	private String empName;
	private int deptId;
	private String designation;
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
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int empId, String empName, int deptId, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	
	
}

package com.project.Employess;

import java.util.List;

public class EmployeeList 
{
	private List<Employee> emps;

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public EmployeeList(List<Employee> emps) {
		super();
		this.emps = emps;
	}

	public EmployeeList() {
		super();
	}
	
}

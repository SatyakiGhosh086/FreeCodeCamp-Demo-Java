package com.project.MainClass;

import java.util.ArrayList;
import java.util.List;

import com.project.Employess.Employee;
import com.project.Employess.EmployeeList;

public class EmpDriverClass {

	public static void main(String[] args) 
	{
		//Employees Object
		Employee emp1 = new Employee(1,"Emp1",10,"SE");
		Employee emp2 = new Employee(2,"Emp2",10,"SE");
		Employee emp3 = new Employee(3,"Emp3",11,"SE");
		Employee emp4 = new Employee(4,"Emp4",11,"SE");
		Employee emp5 = new Employee(5,"Emp5",12,"SE");
		Employee emp6 = new Employee(6,"Emp6",13,"SE");
		EmployeeList obj = new EmployeeList();
		//Employees in a list
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		emps.add(emp6);
		obj.setEmps(emps);
		
		Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
		obj.getEmps().stream().filter(emp -> emp.getEmpId() > 2)
		.forEach(emp -> {if(emp.getDeptId() == 11||emp.getDeptId() == 12)
			{
				empMap.put(emp.getEmpId(), emp);
			}
			}
		
				);
		
		System.out.println(empMap.toString());
		

	}

}

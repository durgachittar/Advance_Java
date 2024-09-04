package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.Entity.Employee;

public class MainDAO {

	//Create a display method ...send employee object as a parameter
	//and display the object
	
	public void display(Employee emp) {
		//System.out.println(emp);
		
		System.out.println("Name:"+emp.getName());
		System.out.println("id:"+emp.getId());
		System.out.println("Salary:"+emp.getSalary());
		System.out.println("Mobile no:"+emp.getMobile());
		System.out.println("Department:"+emp.getDept().getRole());
	//chainning of methods
	}
	
	public void getData(ArrayList<Employee> emplist) {
		
		for(Employee e:emplist) 
		{
			System.out.println(e);
			
		}
	}
	
	public List<Employee> returnEmpList(Employee e1,Employee e2,Employee e3)
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
		
	}
}


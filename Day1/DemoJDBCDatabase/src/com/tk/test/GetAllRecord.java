package com.tk.test;

import java.util.List;

import com.tk.dao.EmployeeDAO;
import com.tk.entity.Employee;

public class GetAllRecord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		List<Employee> list= dao.getAllRecord();
		
		for(Employee emp:list) {
			System.out.println(emp);
		}
}
}

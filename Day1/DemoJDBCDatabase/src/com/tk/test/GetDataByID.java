package com.tk.test;

import com.tk.dao.EmployeeDAO;
import com.tk.entity.Employee;

public class GetDataByID {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		Employee emp= dao.getParticularRecord(3);
		System.out.println(emp);

	}
}

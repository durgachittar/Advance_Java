package com.tk.test;

import com.tk.dao.EmployeeDAO;
import com.tk.entity.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAO();
		Employee emp=new Employee("SUmit Raokhande", "sumit@gmail.com");
		dao.insertData(emp);

	}

}

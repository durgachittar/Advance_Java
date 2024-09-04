package com.tk.test;

import com.tk.dao.EmployeeDAO;
import com.tk.entity.Employee;

public class UpdateMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao=new EmployeeDAO();
		
		Employee e=new Employee();
		e.setId(4);
		e.setName("Sumit");
	
		int status= dao.updateRecord(e);
		
		if(status>0) {
			System.out.println
			("Record is Updatated successfully");
		}else {
			System.out.println
			("Record is Not Updatated successfully");
		}
		

	}
}

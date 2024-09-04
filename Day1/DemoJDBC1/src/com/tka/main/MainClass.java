package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import com.tka.Entity.Employee;
import com.tka.dao.MainDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Sumit",50000,"sumit@gmail.com","89765432","DevOps");
		//System.out.println(emp);
		Employee emp1=new Employee("Asmita",60000,"asmita@gmail.com","90065432","Sales");
		
		Employee emp2=new Employee("Neelima",70000,"neelima@gmail.com","70065432","Marketing");
		
		MainDAO md=new MainDAO();
		md.display(emp);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		md.getData(list);
		
		List<Employee> empList=md.returnEmpList(emp, emp1, emp2);
		for(Employee e:empList)
		{
				System.out.println(e);
		}
}
	

}

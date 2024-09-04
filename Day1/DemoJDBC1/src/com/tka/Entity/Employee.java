package com.tka.Entity;

public class Employee {
String name;
int id=1;
double salary;
String emailid;
String mobile;
Department dept;//reference and not a object

public Employee() {
	
}
public Employee(String name, double salary, String emailid, String mobile,String role) {
	super();
	this.name = name;
	this.salary = salary;
	this.emailid = emailid;
	this.mobile = mobile;
	this.dept=new Department(role);//tightly coupling of has a relationship...object created inside constructor
//if object created in main then loosely coupling
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", emailid=" + emailid + ", mobile="
			+ mobile + ", dept=" + dept + "]";
}


}





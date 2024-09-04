package com.tka.Entity;

public class Department {
	String role;
	public Department()
	{}
	
	
	@Override
	public String toString() {
		return "Department [role=" + role + "]";
	}


	public Department(String role) {
		super();
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}

package com.js.comparator;

public class Employee {
	private int empId;
	private String name;
	private String qualification;
	private String experience;

	public Employee(int empId, String name, String qualification, String experience) {

		this.empId = empId;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", qualification=" + qualification + ", experience="
				+ experience + "]";
	}

}

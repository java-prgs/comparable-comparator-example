package com.js.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String qualification;
	private String address;

	public int compareTo(Student student) {
		return (this.id - student.id);
	}

	public Student(int id, String name, String qualification, String address) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [Id=" + id + ", name=" + name + ", qualification=" + qualification + ", address=" + address
				+ "]";
	}

}

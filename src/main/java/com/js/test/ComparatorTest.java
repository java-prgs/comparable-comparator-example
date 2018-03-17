package com.js.test;

import java.util.Arrays;

import com.js.comparator.EmpNameQualificationComparator;
import com.js.comparator.Employee;
import com.js.comparator.EmployeeNameComparotor;

public class ComparatorTest {
	public static void main(String[] args) {
		Employee[] newEmployees = new Employee[4];
		 
		newEmployees[0] = new Employee(12, "john", "mca", "3");
		newEmployees[1]=new Employee(13, "john", "bca", "2");
		newEmployees[2] = new Employee(10, "smith", "llb", "3");
		newEmployees[3]=new Employee(11, "riya", "btech", "2");
		
		Arrays.sort(newEmployees, new EmployeeNameComparotor());
		System.out.println("ByName sorting"+Arrays.toString(newEmployees));
		Arrays.sort(newEmployees, new EmpNameQualificationComparator());
		System.out.println("IfNameSameByQualification sorting"+Arrays.toString(newEmployees));
	}

}

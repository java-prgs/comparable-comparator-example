package com.js.comparator;

import java.util.Comparator;

public class EmpNameQualificationComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		int flag=o1.getName().compareTo(o2.getName());
		if(flag==0)
		flag= o1.getQualification().compareTo(o2.getQualification());
		return flag;
	
	
	}
	

}

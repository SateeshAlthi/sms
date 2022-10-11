package com.tyss.collectionsdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee implements Serializable{
	
	private int eid;
	private String ename;
	private String designation;
	private List<String> technologystack;
	private Set<Employee> reportingEmployees;
	
	public Employee() {
		
	}

	public Employee(int eid, String ename, String designation, List<String> technologystack,
			Set<Employee> reportingEmployees) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
//		this.technologystack = technologystack;
		this.technologystack = new ArrayList<String>(technologystack);
//		this.reportingEmployees = reportingEmployees;
		if (reportingEmployees!=null)
			this.reportingEmployees = new HashSet<Employee>(reportingEmployees);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", technologystack="
				+ technologystack + ", reportingEmployees=" + reportingEmployees + "]";
	}
	

}

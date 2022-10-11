package com.tyss.collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeMain {
	
	public static void main(String[] args) {
				
		List<String> technologies1 = new ArrayList<String>();
		technologies1.add("Java");
		technologies1.add("Spring");
		technologies1.add("Angular");
		
		List<String> technologies2 = new ArrayList<String>();
		technologies2.add("JDBC");
		technologies2.add("Hibernate");
		technologies2.add("React");
		
		
		Employee sateesh = new Employee(1, "Sateesh", "Trainee1", technologies1, null);
		System.out.println(sateesh);
		
		Employee arjun = new Employee(2, "Arjun", "Trainee2", technologies1, null);
		System.out.println(arjun);
		
		Set<Employee> reportingEmployees1 = new HashSet<Employee>();
		reportingEmployees1.add(sateesh);
		reportingEmployees1.add(arjun);
		
		Employee anshu = new Employee(3, "Anshu", "Manager",technologies2, reportingEmployees1);
		System.out.println(anshu);
	
		
	
	}

}

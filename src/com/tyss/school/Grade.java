package com.tyss.school;

import java.util.ArrayList;
import java.util.List;

public class Grade {
	
	private int id;
	private String grade;
	private List<Subject> subjects;
	
	
	public Grade () {
		
	}

	public Grade(int id, String grade, List<Subject> subjects) {
		super();
		this.id = id;
		this.grade = grade;
		this.subjects = new ArrayList<Subject>(subjects);
	}

	public int getId() {
		return id;
	}

	public String getGrade() {
		return grade;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = new ArrayList<Subject>(subjects);
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", grade=" + grade + ", subjects=" + subjects + "]";
	}


	
}

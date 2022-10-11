package com.tyss.school;

public class Subject {
	
	private int id;
	private String name;
	private Marks marks;
	public Subject(int id, String name, Marks marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	

	
}

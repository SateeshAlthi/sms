package com.tyss.school;

public class NewSubjects {

	private int id;
	private String name;
	public NewSubjects(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "NewSubjects [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

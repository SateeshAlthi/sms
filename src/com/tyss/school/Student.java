package com.tyss.school;

public class Student {

	private int id;
	private String name;
	private int age;
	private String gender;
	private Address address;
	private int percentage;
	private Grade grade;

	
	public Student() {
		
	}

	public Student(int id, String name, int age, String gender, Address address, int percentage, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.percentage = percentage;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Address getAddress() {
		return address;
	}

	public int getPercentage() {
		return percentage;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
}

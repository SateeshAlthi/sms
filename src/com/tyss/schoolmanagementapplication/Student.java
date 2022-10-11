package com.tyss.schoolmanagementapplication;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String grade;
	private String fname;
	private String mname;
	private Address address;
	private String subjects;
	private Marks marks;
	private String newgrade;

	public Student() {
	
	}
	
	public Student(int id, String name, String gender,String fname, String mname,
			Address address, Marks marks) {
		super();
		this.id = id;
		this.name = name;
		age=11;
		this.gender = gender;
		grade = "6th Grade";
		this.fname = fname;
		this.mname = mname;
		this.address = address;
		subjects = "Maths,Physics,Chemisrty";
		this.marks = marks;
		
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

	public String getGrade() {
		return grade;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public Address getAddress() {
		return address;
	}

	public String getSubjects() {
		return subjects;
	}

	public Marks getMarks() {
		return marks;
	}

	public String getNewgrade() {
		return newgrade;
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

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public void setNewgrade(String newgrade) {
		this.newgrade = newgrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", grade=" + grade + ", fname=" + fname
				+ ", mname=" + mname + ", address=" + address + ", subjects=" + subjects + ", marks=" + marks
				+ ", newgrade=" + newgrade + "]";
	}


	
}

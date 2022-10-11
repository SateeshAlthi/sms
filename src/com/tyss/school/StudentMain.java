package com.tyss.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentMain {

	Student student = new Student();
	 
	public int calcOvPercentage(Student student) {

		int sumOfThMarks = 0;
		int sumOfPrMarks = 0;

		for (Subject subj : student.getGrade().getSubjects()) {
			sumOfThMarks += subj.getTheoryMarks();
			sumOfPrMarks += subj.getPracticalMarks();
		}
//		int sumOfTotalMarks = sumOfThMarks + sumOfPrMarks;
//		System.out.println("Total Theory Marks of " + student.getName() + " is: " + sumOfThMarks);
//		System.out.println("Total Practical Marks of " + student.getName() + " is: " + sumOfPrMarks);
//		System.out.println("Total Marks of " + student.getName() + " is: " + sumOfTotalMarks);
		return ((sumOfThMarks / student.getGrade().getSubjects().size()) + (sumOfPrMarks / student.getGrade().getSubjects().size())) / 2;
	}

	public static void main(String[] args) {
		Address address1 = new Address(123, "MainStreet", "Banagalore", 560066);
		Address address2 = new Address(456, "RightStreet", "Banagalore", 560066);
		Address address3 = new Address(789, "LeftStreet", "Banagalore", 560066);
		
		
		Marks marks1 = new Marks(60,70);
		Marks marks2 = new Marks(50,60);
		Marks marks3 = new Marks(40,50);
		
		StudentMain sm = new StudentMain();
		
		Grade grade6 = new Grade();
		List<Subject> sublist6 = grade6.getSubjects();
		sublist6.add(new Subject(1, "Maths",new Marks()));
		sublist6.add(new Subject(2, "Physics",new Marks()));
		sublist6.add(new Subject(3, "Chemistry",new Marks()));
		
		Grade grade7 = new Grade();
		List<Subject> sublist7 = grade7.getSubjects();
		sublist7.add(new Subject(4, "Botony",new Marks()));
		sublist7.add(new Subject(5, "Zoology",new Marks()));
		sublist7.add(new Subject(6, "Biology",new Marks()));
		
		

		Student ram = new Student();
		ram.setName("Ram");
		ram.setId(1);
		ram.setAddress(address3);
		ram.setAge(0);
		ram.setGender(null);
		
		ram.setGrade(grade7);
		String subName = ram.getGrade().getSubjects().get(0).getName();
		for(Subject sub : ram.getGrade().getSubjects()) {
			switch(sub.getName()) {
			case "Botony":
				sub.setMarks(marks1);
				break;
			case "Zoology":
				sub.setMarks(marks2);
				break;
			case "Biology":
				sub.getMarks().setPracticalMarks(50);
				sub.getMarks().setTheoryMarks(40);
				break;
			}
			
		}
		
		List<Student> stList = new ArrayList<>();
		
		stList.add(new Student(1, "Ram", 11, "Male", address1, 0, grade6));
		stList.add(new Student(2, "Sita", 11, "Female",address2, 0, grade6));
		stList.add(new Student(3, "Prem", 11, "Male", address3, 0, grade6));
		
		for (Student st : stList) {
			int percentage = sm.calcOvPercentage(st);
			System.out.println(st.getName() + " percentage is: " + percentage);
			st.setPercentage(percentage);
			if (percentage >= 60) {
				st.setGrade(grade7);
				System.out.println("This Student " + st.getName() + " is upgraded: " + st);
			} else {
				st.setGrade(grade6);
				System.out.println("This Student " + st.getName() + " is not upgraded: " + st);
			}
		}
	}
	
	
	
	
	private Student setStudentData(int id, String name, int age, String gender, Address address,Grade grade) {
		
		Student student = new Student();
		student.setName("Ram");
		student.setId(1);
		student.setAddress(address);
		student.setAge(0);
		student.setGender(null);
		
		String subName = student.getGrade().getSubjects().get(0).getName();
		for(Subject sub : student.getGrade().getSubjects()) {
			switch(sub.getName()) {
			case  :
				sub.getMarks().setPracticalMarks(50);
				sub.getMarks().setTheoryMarks(40);
				break;
			case "Zoology":
				sub.getMarks().setPracticalMarks(50);
				sub.getMarks().setTheoryMarks(40);
				break;
			case "Biology":
				sub.getMarks().setPracticalMarks(50);
				sub.getMarks().setTheoryMarks(40);
				break;
			}
		return null;
	}}
	
	
	private Grade gradeData(int grade) {
		Grade newGrade = new Grade();
		if(grade >=6 || grade <=10) {
		
			switch(grade) {
			case 6:
				newGrade.setSubjects(new Subject(1, "Phy", null));
			}
		}
		
		return null;
	}
}
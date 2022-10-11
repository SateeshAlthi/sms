package com.tyss.schoolmanagementapplication;

public class StudentMain {

	public static void main(String[] args) {
			
	   Address address1= new Address(123, "MainStreet", "Banagalore", 560066);
	   Address address2= new Address(456, "RightStreet", "Banagalore", 560066);
	   Address address3= new Address(789, "LeftStreet", "Banagalore", 560066);
	   
	   Marks ramMarks = new Marks(100, 100, 100); 
	   Marks sitaMarks = new Marks(90, 90, 90);
	   Marks premMarks = new Marks(59, 59, 59);
	       
	   
	Student ram = new Student(1,"Ram","Male","RamFather", "RamMother",  address1, ramMarks);
	if(ramMarks.getPercentage()>60)
		ram.setNewgrade("7th Grade");
	else
		ram.setNewgrade("6th Grade");
	System.out.println(ram);
	
	Student sita = new Student(2,"Sita","Female","SitaFather", "SitaMother", address2,sitaMarks);
	if(sitaMarks.getPercentage()>60)
		sita.setNewgrade("7th Grade");
	else
		sita.setNewgrade("6th Grade");
	System.out.println(sita);
	
	Student prem = new Student(3,"Prem","Male","PremFather", "PremMother",address3, premMarks);
	if(premMarks.getPercentage()>60)
		prem.setNewgrade("7th Grade");
	else
		prem.setNewgrade("6th Grade");
	System.out.println(prem);

	}
	

	
}

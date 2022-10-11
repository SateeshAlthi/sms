package com.tyss.school;

public class Address {
	
	
	private int dno;
	private String streetname;
	private String city;
	private int princode;
	
	public Address() {
		
	}
	
	public Address(int dno, String streetname, String city, int princode) {
		super();
		this.dno = dno;
		this.streetname = streetname;
		this.city = city;
		this.princode = princode;
	}
	
	public int getDno() {
		return dno;
	}
	public String getStreetname() {
		return streetname;
	}
	public String getCity() {
		return city;
	}
	public int getPrincode() {
		return princode;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPrincode(int princode) {
		this.princode = princode;
	}

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", streetname=" + streetname + ", city=" + city + ", princode=" + princode + "]";
	}
	

}

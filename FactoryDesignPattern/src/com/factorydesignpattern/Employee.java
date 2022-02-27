package com.factorydesignpattern;

public class Employee {
	
	
	private String name;
	private String id;
	private int age;
	private String city;
	private String modeofcontact;
	private String email;
	
	public Employee(String name, String id, int age, String city, String modeofcontact, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.city = city;
		this.modeofcontact = modeofcontact;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getModeofcontact() {
		return modeofcontact;
	}
	public void setModeofcontact(String modeofcontact) {
		this.modeofcontact = modeofcontact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

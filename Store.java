package com.fmt;

public class Store{
	private String code;
	private Person manager;
	private Address address;
	private String managerCodeStore;
	//class to create stores objects
	
	public Store(String code, String managerCode, String street, String city, String state, String zip,
			String country) {
		this.code = code;
		this.manager =new Person(managerCode);
		this.setAddress(new Address(street,city,state,zip,country));
	}

	


	public Store(String code, String managerCodeStore, String street, String city, String state, String zip,
			String country, Person person) {
		this.code=code;
		this.managerCodeStore = managerCodeStore;
		this.setAddress(new Address(street,city,state,zip,country));
		this.manager = person;
	}
	public Store() {
		code= "    ";
	}
	public String getCode() {
		return code;
	}

	
	
	public String toString() {
		return code + "\t\t" + manager;
		
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}



	public Person getManager() {
		return manager;
	}




	public String getManagerCodeStore() {
		return managerCodeStore;
	}
	
}
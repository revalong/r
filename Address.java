package com.fmt;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	
	public Address(String street, String city, String state, String zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}


	public Address() {
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.country = "";
		
	}
	public String getAddress() {
		return street + "\n" + city + " " + state + " " + zip + " " + country;
		
	}
	
	
	
}

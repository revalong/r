package com.fmt;

public abstract class Item{
	private String type;
	
	private transient String code;
	private transient String name;
	private transient String unit; 
	private transient double unitPrice;
	private transient String model;
	private transient double hourlyRate;
	private double price;
	private String date1;
	private String date2;
	private String invoiceCode;
	private String s;
	private Product product;
	
//class to create items objects
	
	public Item(String code, String type, String name, String model){
		this.code=code;
		this.type=type;
		this.name=name;
		this.model=model;
		
	}
	public Item(String invoiceCode) {
		this.invoiceCode=invoiceCode;
	}
	public Item(String invocieCode,String s) {
		this.invoiceCode=invoiceCode;
		this.s=s;
	}
	public String getCode() {
		return code;
	}
	public Item(String code, String type, String name, String unit, String unitPrice) {
		this.code=code;
		this.type= type;
		this.name=name;
		this.product=new Product(code,name,unit,unitPrice);
	}
	public String getName() {
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public String getModel() {
		return model;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getPrice() {
		return price;
	}
	public String getDate1() {
		return date1;
	}
	public String getDate2() {
		return date2;
	}
	

	public Item(String code, String name, String unit, double unitPrice,String type) {
		this.code=code;
		this.name=name;
		this.unit=unit;
		this.unitPrice=unitPrice;
		this.type=type;
	}
	public Item(String code, String type, String name, double hourlyRate) {
		this.type=type;
		this.code=code;
		this.name=name;
		this.hourlyRate=hourlyRate;
		
	}
	public Item(String code, double price, String date1, String date2,String type) {
		this.price=price;
		this.date1=date1;
		this.date2=date2;
		this.type=type;
		this.code=code;
	}
	public Item(double price2, String itemCode,String type) {
		this.price=price2;
		this.code=itemCode;
	}
	public String getType() {
		if(type.equals("P")) {
			return "Product";
		}
		if(type.equals("S")) {
			return "Service";
		}
		if(type.equals("E")) {
			return "Equipment";
		}
		return type;
	}
	
	public String toString() {
		return type;
	}


	public String getS() {
		return s;
	}
	

} 
package com.fmt;

public class Product extends Item implements Invoiceable{
	private String name;

	public Product(String code,  String name, String unit, String unitPrice) {
		super(code,name,unit,Double.parseDouble(unitPrice),"P");
		this.name=name;

	
	}
	

	public double getSubTotalPay() {
		return super.getUnitPrice()*Integer.parseInt(super.getS());
	}
	public double getTotalPay() {
		return getSubTotalPay()-getTaxes();
	}
	
	public double getTaxes() {
	
		return 0.0715*getSubTotalPay();
	}


	public String getCode() {
		return super.getCode();
	}


	public String getName() {
		return super.getName();
	}


	public String getUnit() {
		return super.getUnit();
	}


	
	public double getTotal() {
		return getSubTotalPay()-getTaxes();
	}
	
	

}
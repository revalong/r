package com.fmt;

public class Purchase extends Equipment implements Invoiceable{
	
	public Purchase(String itemCode,double price) {
		super(price,itemCode);
		

	}
	public double getSubTotalPay() {
		return super.getPrice();
	}
	public double getTotalPay() {
		return super.getPrice()-getTaxes();
	}
	
	public double getTaxes() {
		return 0;
	}
	public String getItemCode() {
		return super.getCode();
	}
	
	public double getTotal() {
		return super.getPrice();
	}
	
	

}

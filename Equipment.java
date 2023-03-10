package com.fmt;

import javax.script.Invocable;

public class Equipment extends Item{
	private Purchase p;
	private Lease l;

	
	
	
	public Equipment(String code, String type, String name, String model) {
		super(code,type,name,model);
		
	}



	public Equipment(String code,double price, String date1, String date2) {
		super(code,price,date1,date2,"Lease");
		
	}



	public Equipment(double price, String itemCode) {
		super(price,itemCode, "Purchase");
	}




}
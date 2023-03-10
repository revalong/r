package com.fmt;

import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDate;

public class Lease extends Equipment implements Invoiceable{
private String name;
private String model;
	
	public Lease(String code, double price, String date1, String date2,String name,String model) {
		super(code, price, date1, date2);
		this.name=name;
		this.model=model;
	
	}
	
	public double getSubTotalPay() {
		return super.getPrice();
	}

	public double lengthOfTime() {
		return Period.between(LocalDate.parse(super.getDate1()), LocalDate.parse(super.getDate2())).getDays();
		
	}


	public double getTaxes() {
		if(super.getPrice()<10000) {
			return super.getPrice();
		}
		else if(super.getPrice()>10000 && super.getPrice()<100000){
			return super.getPrice()+500;
		}
		else {
			return super.getPrice() + 1500;
		}
	}

	@Override
	public double getTotal() {
		return super.getPrice()-(((int)(lengthOfTime()/30))*getTaxes());
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	

}






package com.fmt;

public class Service extends Item implements Invoiceable{
	
	
	
	public Service(String code, String type, String name, String hourlyRate) {
		super(code,type,name,Double.parseDouble(hourlyRate), "S");
	
			}
	
	public double getTaxes() {
		return super.getHourlyRate() *Double.parseDouble(super.getS()) *.0345;
	}


	public double getTotalPay() {
		return getSubTotalPay()-getTaxes();
	}

	public double getSubTotalPay() {
		return super.getHourlyRate()*Double.parseDouble(super.getS());
	}

	public String getCode() {
		return super.getCode();
	}

	public String getType() {
		return super.getType();
	}

	public String getName() {
		return super.getName();
	}

	@Override
	public double getTotal() {
		return getSubTotalPay()-getTaxes();
	}
	

}
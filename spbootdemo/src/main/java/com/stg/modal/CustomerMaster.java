package com.stg.modal;

import java.util.Date;

public class CustomerMaster {

	private int customerNo;
	private String customerName;
	private String customerCity;
	private long customerContactNo;
	private Date customerDob;

	public CustomerMaster() {
		super();
	}

	public CustomerMaster(int customerNo, String customerName, String customerCity, long customerContactNo,
			Date customerDob) {
		super();
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerContactNo = customerContactNo;
		this.customerDob = customerDob;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public long getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(long customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public Date getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}

}

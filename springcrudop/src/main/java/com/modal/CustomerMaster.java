package com.modal;

public class CustomerMaster {

	private int customerNo;
	private String customerName;
	private String customerCity;
	private long customerContactNo;
	private String customerDob;

	public CustomerMaster() {
		super();
	}

	public CustomerMaster(int customerNo, String customerName, String customerCity, long customerContactNo,
			String customerDob) {
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

	public String getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}

}

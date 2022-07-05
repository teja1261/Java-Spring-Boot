package com.model;

public class AddressModel {

	private int doorNo;
	private String streetName;
	private String city;
	private String state;

	public AddressModel() {
		super();
	}

	public AddressModel(int doorNo, String streetName, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

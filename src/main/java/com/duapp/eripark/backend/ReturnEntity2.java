package com.duapp.eripark.backend;

import java.util.List;

public class ReturnEntity2 {
	private int id;
	private String title;
	private String address;
	private int leftParkingCount;
	private int leftPowerCharge;
	private List<Double> location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLeftParkingCount() {
		return leftParkingCount;
	}
	public void setLeftParkingCount(int leftParkingCount) {
		this.leftParkingCount = leftParkingCount;
	}
	public int getLeftPowerCharge() {
		return leftPowerCharge;
	}
	public void setLeftPowerCharge(int leftPowerCharge) {
		this.leftPowerCharge = leftPowerCharge;
	}
	public ReturnEntity2(int id, String title, String address,
			int leftParkingCount, int leftPowerCharge,List location) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.leftParkingCount = leftParkingCount;
		this.leftPowerCharge = leftPowerCharge;
		this.location=location;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
}

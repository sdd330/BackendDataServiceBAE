package com.duapp.eripark.backend;

public class ReturnEntity {
	private int id;
	
	private String title;
	
	private String tags;
	
	private int distance;
	
	private int leftParkingCount;

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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	
	public ReturnEntity(int id, String title, String tags, int distance,
			int leftParkingCount) {
		super();
		this.id = id;
		this.title = title;
		this.tags = tags;
		this.distance = distance;
		this.setLeftParkingCount(leftParkingCount);
	}

	public int getLeftParkingCount() {
		return leftParkingCount;
	}

	public void setLeftParkingCount(int leftParkingCount) {
		this.leftParkingCount = leftParkingCount;
	}
	
	
}

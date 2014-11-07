package com.duapp.eripark.backend;

import java.util.List;

public class ReturnEntities2Result extends DataResult {
	private List<ReturnEntity2> returnEntities;


	public List<ReturnEntity2> getReturnEntities(){
		return returnEntities;
	}
	


	public void setReturnEntities(List<ReturnEntity2> returnEntities) {
		this.returnEntities = returnEntities;
	}
}

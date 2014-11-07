package com.duapp.eripark.backend;

import java.util.List;

public class ReturnEntitiesResult extends DataResult {
	private List<ReturnEntity> returnEntities;


	public List<ReturnEntity> getReturnEntities(){
		return returnEntities;
	}
	


	public void setReturnEntities(List<ReturnEntity> returnEntities) {
		this.returnEntities = returnEntities;
	}
}

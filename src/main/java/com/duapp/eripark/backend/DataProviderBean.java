package com.duapp.eripark.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.duapp.eripark.database.RequestUtil;

/**
 * The purpose of this class is to encapsulate logic for retrieving
 * StringProvider data.
 */
@Controller
public class DataProviderBean implements DataProviderService {

	private void setSuccessResult(DataResult result) {
		result.setResultCode(0);
		result.setResultMessage("success!");
	}

	@Override
	public DataResult getEmptyResult() {
		DataResult result = new DataResult();
		setSuccessResult(result);
		return result;
	}

	@Override
	public CategoryEntriesResult getCategoryEntriesResult() {
		CategoryEntriesResult result = new CategoryEntriesResult();
		List<CategoryEntry> categoryEntries = new ArrayList<CategoryEntry>();
		categoryEntries.add(new CategoryEntry("111", "111"));
		categoryEntries.add(new CategoryEntry("222", "222"));
		categoryEntries.add(new CategoryEntry("333", "333"));
		result.setCategoryEntries(categoryEntries);
		setSuccessResult(result);
		return result;
	}

	@Override
	public NewsTitleEntriesResult getNewsTitleEntriesResult() {
		NewsTitleEntriesResult result = new NewsTitleEntriesResult();
		List<NewsTitleEntry> newsTitleEntriesResult = new ArrayList<NewsTitleEntry>();
		newsTitleEntriesResult.add(new NewsTitleEntry("news111", "news111"));
		newsTitleEntriesResult.add(new NewsTitleEntry("news222", "news222"));
		newsTitleEntriesResult.add(new NewsTitleEntry("news333", "news333"));
		result.setNewsTitleEntries(newsTitleEntriesResult);
		setSuccessResult(result);
		return result;
	}

	@Override
	public NewsResult getNewsResult() {
		NewsResult result = new NewsResult("111", "news111", "newsContent111");
		setSuccessResult(result);
		return result;
	}

	@Override
	public PositionsResult getPositions() {
		// TODO Auto-generated method stub
		PositionsResult result = new PositionsResult();
		List<Position> positions = new ArrayList<Position>();
		positions.add(new Position("bmw-001", "park1", 121.345, 30.134,
				"http://photo1", "description1"));
		positions.add(new Position("bmw-002", "park2", 121.335, 30.234,
				"http://photo2", "description1"));
		positions.add(new Position("bmw-003", "park3", 121.325, 30.334,
				"http://photo3", "description1"));
		result.setPositions(positions);
		setSuccessResult(result);
		return result;
	}

	@Override
	public ReturnEntitiesResult getReturnEntities(
			@RequestParam("location") String location) {
	
		//String location="121.361283,31.225804";
		ReturnEntitiesResult result = new ReturnEntitiesResult();
		List<ReturnEntity> returnEntities = new ArrayList<ReturnEntity>();
		Map map = new HashMap<String, String>();
		map.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map.put("geotable_id", "72181");
		map.put("tags", "parking");
		map.put("location", location);
		map.put("sortby", "distance:1");

		JSONObject json = RequestUtil.getData(
				"http://api.map.baidu.com/geosearch/v3/nearby", map);

		JSONArray array = json.getJSONArray("contents");
		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonobject = array.getJSONObject(i);
			int id = jsonobject.getInt("uid");
			String title = jsonobject.getString("title");
			String tags_ = jsonobject.getString("tags");
			int distance = jsonobject.getInt("distance");
			int leftParkingCount = jsonobject.getInt("leftParkingCount");
			ReturnEntity re = new ReturnEntity(id, title, tags_, distance,
					leftParkingCount);
			returnEntities.add(re);
		}
		result.setReturnEntities(returnEntities);
		setSuccessResult(result);
		return result;
	}
	
	@Override
	public ReturnEntities2Result getReturnEntities2(
			@RequestParam("id") int id) {
	
		//String location="121.361283,31.225804";
		ReturnEntities2Result result = new ReturnEntities2Result();
		List<ReturnEntity2> returnEntities = new ArrayList<ReturnEntity2>();
		Map map = new HashMap<String, String>();
		map.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map.put("geotable_id", "72181");
		//need to convert to string, or will throw cast exception in getData method
		map.put("uid",  String.valueOf(id));

		JSONObject json = RequestUtil.getData(
				"http://api.map.baidu.com/geosearch/v3/detail/"+id, map);

		JSONArray array = json.getJSONArray("contents");
		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonobject = array.getJSONObject(i);
			String title = jsonobject.getString("title");
			String address = jsonobject.getString("address");
			int leftParkingCount = jsonobject.getInt("leftParkingCount");
			int leftPowerCharge = jsonobject.getInt("leftPowerCharge");
			JSONArray loc = jsonobject.getJSONArray("location");
			List<Double> location = new ArrayList<Double>();
			location.add(new Double(loc.getDouble(0)));
			location.add(new Double(loc.getDouble(1)));
			
			ReturnEntity2 re = new ReturnEntity2(id, title, address,
					leftParkingCount,leftPowerCharge, location);
			returnEntities.add(re);
		}
		System.out.println(array);
		result.setReturnEntities(returnEntities);
		setSuccessResult(result);
		return result;
	}

}

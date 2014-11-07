package com.duapp.eripark.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class DataOperation {
	public final static String BASE = "http://api.map.baidu.com/geodata/v3";

	// POST
	public final static String GEOTABLE_CREATE = BASE + "/geotable/create";

	public final static String GEOTABLE_DELETE = BASE + "/geotable/delete";

	public final static String GEOTABLE_UPDATE = BASE + "/geotable/update";

	// GET
	public final static String GEOTABLE_DETAIL = BASE + "/geotable/detail";

	public final static String GEOTABLE_LIST = BASE + "/geotable/list";

	// POST
	public final static String COLUMN_CREATE = BASE + "/column/create";

	public final static String COLUMN_UPDATE = BASE + "/column/update";

	public final static String COLUMN_DELETE = BASE + "/column/delete";

	// GET
	public final static String COLUMN_DETAIL = BASE + "/column/detail";

	public final static String COLUMN_LIST = BASE + "/column/list";

	// POI
	public final static String POI_CREATE = BASE + "/poi/create";

	public final static String POI_DETAIL = BASE + "/poi/detail";

	public final static String POI_UPDATE = BASE + "/poi/update";

	public final static String POI_DELETE = BASE + "/poi/delete";

	public final static String POI_LIST = BASE + "/poi/list";

	public final static String AK = "8d0ad60440598d9869ebc7819dad0afc";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// TODO test it

		// http://api.map.baidu.com/geodata/v3/geotable/detail
/*
		Map map1 = new HashMap<String, String>();
		map1.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map1.put("id", "72181");

		JSONObject json1 = RequestUtil.getData(GEOTABLE_DETAIL, map1);
		System.out.println(json1.toString());

		// http://api.map.baidu.com/geodata/v3/geotable/list
		Map map2 = new HashMap<String, String>();
		map2.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map2.put("geotable_id", "72181");
		JSONObject json2 = RequestUtil.getData(GEOTABLE_LIST, map2);
		System.out.println(json2.toString());

		// http://api.map.baidu.com/geodata/v3/column/list
		Map map3 = new HashMap<String, String>();
		map3.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map3.put("geotable_id", "72181");
		map3.put("key", "parkingNo");
		JSONObject json3 = RequestUtil.getData(COLUMN_LIST, map3);
		System.out.println(json3.toString());

		// http://api.map.baidu.com/geodata/v3/column/list
		Map map4 = new HashMap<String, String>();
		map4.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map4.put("geotable_id", "72181");
		JSONObject json4 = RequestUtil.getData(POI_LIST, map4);
		System.out.println(json4.toString());

		System.out.println("--------------nearby");
		// http://api.map.baidu.com/geosearch/v3/nearby
		Map map5 = new HashMap<String, String>();
		map5.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map5.put("geotable_id", "72181");
		// map5.put("q","coffee");
		map5.put("tags", "parking");
		// map5.put("bounds","121.361283,31.225804;121.36467,31.225804");
		map5.put("location", "121.361283,31.225804");
		map5.put("radius", "10000");
		
		
		
		JSONObject json5 = RequestUtil.getData(
				"http://api.map.baidu.com/geosearch/v3/nearby", map5);
		System.out.println(json5.toString());
		System.out.println("--------------nearby");
		

		// http://api.map.baidu.com/geosearch/v3/local
		Map map6 = new HashMap<String, String>();
		map6.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map6.put("geotable_id", "72181");
		map6.put("q", "coffee");
		map6.put("region", "上海");
		JSONObject json6 = RequestUtil.getData(
				"http://api.map.baidu.com/geosearch/v3/local", map6);
		System.out.println(json6.toString());
*/
		// http://api.map.baidu.com/geosearch/v3/detail/377324884?ak=8d0ad60440598d9869ebc7819dad0afc&geotable_id=72181
		Map map7 = new HashMap<String, String>();
		map7.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
		map7.put("geotable_id", "72181");
		JSONObject json7 = RequestUtil.getData(
				"http://api.map.baidu.com/geosearch/v3/detail/377324884", map7);
		System.out.println(json7.toString());
	
		//column detail
//		Map map8 = new HashMap<String, String>();
//		map8.put("ak", "8d0ad60440598d9869ebc7819dad0afc");
//		map8.put("geotable_id", "72181");
//		map8.put("id","66987");
//		JSONObject json8 = RequestUtil.getData(COLUMN_DETAIL, map8);
//		System.out.println(json8.toString());
		
		
		// POST http://api.map.baidu.com/geodata/v3/geotable/create
//		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
//		params.add(new BasicNameValuePair("name", "eriTrack_Position_1"));
//		params.add(new BasicNameValuePair("id", "72181"));
//		// params.add(new BasicNameValuePair("is_published","0"));
//		params.add(new BasicNameValuePair("ak",
//				"8d0ad60440598d9869ebc7819dad0afc"));
//		JSONObject json_ = RequestUtil.postData(GEOTABLE_UPDATE, params);
//		System.out.println(json_.toString());

		// http://api.map.baidu.com/geodata/v3/column/update
//		List<BasicNameValuePair> params2 = new ArrayList<BasicNameValuePair>();
//		params2.add(new BasicNameValuePair("name", "剩余车位"));
//		params2.add(new BasicNameValuePair("id", "66987"));
//		params2.add(new BasicNameValuePair("geotable_id", "72181"));
//		params2.add(new BasicNameValuePair("ak",
//				"8d0ad60440598d9869ebc7819dad0afc"));
//		
//		JSONObject json_2 = RequestUtil.postData(COLUMN_UPDATE, params2);
//		System.out.println(json_2.toString());

		// List<BasicNameValuePair> params2 = new
		// ArrayList<BasicNameValuePair>();
		// params2.add(new BasicNameValuePair("geotable_id", "72181"));
		// params2.add(new BasicNameValuePair("name", "描述"));
		// params2.add(new BasicNameValuePair("key", "description"));
		// params2.add(new BasicNameValuePair("type", "3"));
		// params2.add(new BasicNameValuePair("is_sortfilter_field", "0"));
		// params2.add(new BasicNameValuePair("is_index_field", "0"));
		// params.add(new
		// BasicNameValuePair("ak","8d0ad60440598d9869ebc7819dad0afc"));
		// JSONObject json_2 = RequestUtil.postData(GEOTABLE_UPDATE, params);
		// System.out.println(json_2.toString());
	}

}

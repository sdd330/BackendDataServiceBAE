package com.duapp.eripark.database;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.JSONTokener;

public class RequestUtil {
	public static JSONObject getData(String url, Map<String, String> map) {
		HttpClient httpclient = new DefaultHttpClient();
		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			String val = (String) entry.getValue();
			params.add(new BasicNameValuePair(key, val));
		}
		String param = URLEncodedUtils.format(params, "UTF-8");
		System.out.println(url + "?" + param);
		HttpGet httpget = new HttpGet(url + "?" + param);
		JSONObject json = null;

		try {
			HttpResponse res = httpclient.execute(httpget);
			if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = res.getEntity();
				json = new JSONObject(new JSONTokener(new InputStreamReader(
						entity.getContent(), HTTP.UTF_8)));
			}

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			httpclient.getConnectionManager().shutdown();
		}
		return json;
	}

	public static JSONObject postData(String url,
			List<BasicNameValuePair> params) {
		System.out.println("Parameter:"+params.toString());
		JSONObject result = null;
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		System.out.println(url);
		try {
			post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));

			HttpResponse res = client.execute(post);
			String resp = EntityUtils.toString(res.getEntity());

			result = new JSONObject(resp);
			int statusCode = result.getInt("status");
			String statusMsg = result.getString("message");
			System.out.println("Post request execution result: [statusCode="
					+ statusCode + ",statusMsg=" + statusMsg +"]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

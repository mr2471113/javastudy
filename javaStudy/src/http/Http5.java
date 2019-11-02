package http;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http5 {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("http://ggoreb.com/http/json2.jsp");
		System.out.println(result);
		
		// []
		JSONArray arr = new JSONArray(result);
		for(int i = 0; i < arr.length(); i++) {
			JSONObject aa = arr.getJSONObject(i);
			int age2 = aa.getInt("age");
			String name2 = aa.getString("name");
			System.out.println(age2 + name2);
			
		}
		
		// {}
		JSONObject obj = new JSONObject(result);
		int age = (int) obj.get("age"); // age 변수를 사용하지 않아서 노란 메시지 발생
		String name = (String) obj.get("name"); // age 변수를 사용하지 않아서 노란 메시지 발생
		
		int age2 = obj.getInt("age");
		String name2 = obj.getString("name");
		
		System.out.println(age2);
		System.out.println(name2);
	}
}
package jsong00505.core.utils;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONUtil {
	private String reqType = "BILL";
	
	public JSONUtil() {

	}
	
	public JSONUtil(String reqType) {
		this.reqType = reqType;
	}
	
	public JSONObject makeHashMapToJSONObject(HashMap<String, String> reqMap) {
		
		JSONObject resJSONObj = new JSONObject();
		
		for(String key: reqMap.keySet()) {
			resJSONObj.put(key, reqMap.get(key));
		}
		 
		return resJSONObj;
	}
	
	public JSONArray makeHashMapToJSONArray(HashMap<String, JSONObject> reqMap) {
		JSONArray resJSONArr = new JSONArray();
		
		for(JSONObject value: reqMap.values()) {
			resJSONArr.add(value);
		}
		
		return resJSONArr;
	}
}

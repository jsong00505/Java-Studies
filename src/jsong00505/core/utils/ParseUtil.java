package jsong00505.core.utils;

import java.util.HashMap;

public class ParseUtil {
	public static String parseMapToString(HashMap<String, String> reqMap) {
		StringBuilder resultSb = new StringBuilder();

		for(String key: reqMap.keySet()) {
			resultSb.append(reqMap.get(key));
		}
		
		return resultSb.toString();
	}
}

package jsong00505.nicepay.sample.test;

import java.util.HashMap;

import jsong00505.core.utils.ParseUtil;

import org.junit.Test;

public class ParseUtilTest {
	@Test
	public void testRequest() {
		HashMap<String, String> reqMap = new HashMap<>();
		
		reqMap.put("test", "test");
		reqMap.put("test2", "test2");
		
		String result = ParseUtil.parseMapToString(reqMap);
		
		System.out.println("RESULT: " + result);
	}
}

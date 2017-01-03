package jsong00505.nicepay.sample.test;

import java.util.HashMap;

import jsong00505.nicepay.sample.NicepayLiteRequest;

import org.junit.Test;

public class NicepayLiteRequestTest {
	@Test
	public void testLiteCancelRequest() {
		NicepayLiteRequest liteRequest = new NicepayLiteRequest();
		
		HashMap<String, String> reqMap = new HashMap<>();
		HashMap<String, String> resMap = new HashMap<>();
		
		double moid = Math.random();
		
		reqMap.put("NicePayHome","C:/Users/WES/workspace/LeetCode/properties");
		
		reqMap.put("TID","nictest04m01011701021846343845");
		reqMap.put("MID", "nictest04m");
		reqMap.put("CancelAmt", "1004 ");
		reqMap.put("CancelMsg", "test");
		reqMap.put("PartialCancelCode", "0");

		reqMap.put("actionType", "CL0");
		reqMap.put("CancelPwd", "123456");
		reqMap.put("CancelIP", "127.0.0.1");	
		reqMap.put("CancelID", "jsong");
		

		
		resMap = liteRequest.doCancelRequest(reqMap);
		
		System.out.println("--------------------------------------------");	
		System.out.println("결과                   : " + resMap.get("ResultCode"));		
		System.out.println("결과 메시지        : " +resMap.get("ResultMsg"));	
		System.out.println("--------------------------------------------");	
	}
}

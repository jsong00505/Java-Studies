package jsong00505.nicepay.sample.test;

import java.util.HashMap;

import jsong00505.nicepay.sample.NicepayTxCancelRequest;

import org.junit.Test;

public class NicepayTxCancelRequestTest {
	@Test
	public void testRequest() {
		NicepayTxCancelRequest txCancelRequest = new NicepayTxCancelRequest();
		
		HashMap<String, String> reqMap = new HashMap<>();
		HashMap<String, String> resMap = new HashMap<>();
		
		double moid = Math.random();
		
		reqMap.put("MID", "");
		reqMap.put("Moid", "test"+moid);
		reqMap.put("TID", "");
		reqMap.put("CancelAmt", "");
		reqMap.put("CancelMsg", "test");
		reqMap.put("CancelPwd", "123456");
		
		reqMap.put("PartialCancelCode", "0");
		reqMap.put("requestPgIp", "121.133.126.13");
		reqMap.put("requestPgPort", "9001");
		
		resMap = txCancelRequest.doRequest(reqMap);
		
		
		System.out.println("--------------------------------------------");	
		System.out.println("결과                   : " + resMap.get("ResultCode"));		
		System.out.println("결과 메시지        : " +resMap.get("ResultMsg"));	
		System.out.println("거래번호(TID) : " +resMap.get("TID"));	
		System.out.println("승인 날짜           : " +resMap.get("AuthDate"));
		System.out.println("승인 번호           : " +resMap.get("AuthCode"));	
		System.out.println("카드사               : " +resMap.get("CardName"));	
		System.out.println("매입카드사        : " +resMap.get("AcquCardName"));	
		System.out.println("--------------------------------------------");	
		
	}
}

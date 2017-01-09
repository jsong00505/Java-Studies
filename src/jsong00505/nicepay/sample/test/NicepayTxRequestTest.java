package jsong00505.nicepay.sample.test;

import java.util.HashMap;

import jsong00505.nicepay.sample.NicepayTxRequest;

import org.junit.Test;

public class NicepayTxRequestTest {
	//@Test
	public void testRequest() {
		NicepayTxRequest txRequest = new NicepayTxRequest();
		
		HashMap<String, String> reqMap = new HashMap<>();
		HashMap<String, String> resMap = new HashMap<>();
		
		double moid = Math.random();
		
		reqMap.put("GoodsName","TEST");
		reqMap.put("Amt", "1004 ");
		reqMap.put("BuyerName", "Smith");
		reqMap.put("BuyerEmail", "test@test.com");
		reqMap.put("BuyerTel", "01012345678");
		reqMap.put("GoodsCnt", "1");
		reqMap.put("BuyerAddr", "Long Beach, CA");
		reqMap.put("Moid", Double.toString(moid));	
		reqMap.put("MallUserID", "");
		reqMap.put("MallReserved", "");
						
		
		reqMap.put("MID", "nictest04m");
		reqMap.put("MallIP", "172.0.0.1");
		
		// 카드 정보 설정
		reqMap.put("CardExpire", "");
		reqMap.put("CardInterest", "0");
		reqMap.put("CardQuota", "00");
		reqMap.put("CardNo", "");
		reqMap.put("CardPwd", "");
		reqMap.put("BuyerAuthNum","880101");
		reqMap.put("CardPoint","0");
		
		// 상점키 설정
		reqMap.put("LicenseKey","b+zhZ4yOZ7FsH8pm5lhDfHZEb79tIwnjsdA0FBXh86yLc6BJeFVrZFXhAoJ3gEWgrWwN+lJMV0W4hvDdbe4Sjw==");	
		
		/** 고정값 사용 */
		reqMap.put("TransType", "0");
		reqMap.put("actionType", "PY0");
		reqMap.put("AuthFlg", "2");
		reqMap.put("CharSet", "utf-8");
		
		resMap = txRequest.doRequest(reqMap);
		
		
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

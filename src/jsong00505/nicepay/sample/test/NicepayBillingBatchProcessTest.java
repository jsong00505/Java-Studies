package jsong00505.nicepay.sample.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import jsong00505.core.utils.Cryptography;
import jsong00505.nicepay.sample.NicepayBillingBatchProcess;

import org.json.simple.JSONObject;
import org.junit.Test;

public class NicepayBillingBatchProcessTest {
	@Test
	public void testRequest() {
		NicepayBillingBatchProcess nbbp = new NicepayBillingBatchProcess("DEV");
		HashMap<String, String> reqObjData = new HashMap<>();
		HashMap<String, JSONObject> reqArrData  = new HashMap<>();
		
		String reqDate = getyyyyMMddHHmmss();
		String merchantKey = "";
		String Amt = "2008";
		
		reqObjData.put("mid", "nictest04m");
		reqObjData.put("reqDate", reqDate);
		reqObjData.put("authString", getAuthString(reqDate, merchantKey, Amt));
		reqObjData.put("utrId", "TEST_" + reqDate);
		reqObjData.put("reqCnt", "1");
		
		for(int i=0; i < 2; i++ ) {
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("seqNo", i);
			jsonObj.put("billkey", "");
			jsonObj.put("moid", reqDate+i);
			jsonObj.put("amt", "1004");
			jsonObj.put("goodsName", "NICE_"+i);
			jsonObj.put("buyerName", "Shaun");
			jsonObj.put("buyerEmail", "it@nicepay.co.kr");
			reqArrData.put(""+i,jsonObj);
		}
		
		nbbp.doBillingBatchRequest(reqObjData, reqArrData);
	}
	
	public final synchronized String getyyyyMMddHHmmss(){
	    SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
	    return yyyyMMddHHmmss.format(new Date());
	}
	
	public final synchronized String getAuthString(String reqDate, String merchantKey, String Amt){
	    String plainText = reqDate + merchantKey + Amt;
	    Cryptography crypto = new Cryptography();
	    String cryptoText = "FAIL";
	    try {
	    	cryptoText = crypto.sha256HexEncrypt(plainText);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return cryptoText;
	}
}

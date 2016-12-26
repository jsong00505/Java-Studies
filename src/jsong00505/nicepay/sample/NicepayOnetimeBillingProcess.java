package jsong00505.nicepay.sample;

import java.util.HashMap;

import kr.co.nicepay.module.lite.NicePayWebConnector;

public class NicepayOnetimeBillingProcess {

	public static HashMap<String, String> doBilling(HashMap<String, String> requestData) {
		NicePayWebConnector	connector;
		HashMap<String, String> result = new HashMap<String, String>();
		
		try{
			connector = new NicePayWebConnector();
			connector.setNicePayHome(requestData.get("SERVER_HOME_PATH"));	
			
			connector.addRequestData("EncodeKey",	requestData.get("EncodeKey"));			            
				
			connector.addRequestData("BillKey",		requestData.get("BillKey"));			
			connector.addRequestData("MID",			requestData.get("MID"));			
			connector.addRequestData("Moid",		requestData.get("Moid"));			
			connector.addRequestData("Amt",			requestData.get("Amt"));			
			connector.addRequestData("GoodsName",	requestData.get("GoodsName"));			
			connector.addRequestData("BuyerName",	requestData.get("BuyerName"));
			connector.addRequestData("BuyerTel",	requestData.get("BuyerTel"));
			connector.addRequestData("BuyerEmail",	requestData.get("BuyerEmail"));			
			connector.addRequestData("MallIP",		requestData.get("MallIP"));
			
			
			connector.addRequestData("CardInterest",requestData.get("CardInterest"));
			connector.addRequestData("CardQuota",	requestData.get("CardQuota"));
		
			if("Y".equals(requestData.get("AdditionalFee"))) {
				connector.addRequestData("SupplyAmt",	requestData.get("SupplyAmt"));			
				connector.addRequestData("GoodsVat",	requestData.get("GoodsVat"));			
				connector.addRequestData("ServiceAmt",	requestData.get("ServiceAmt"));			
				connector.addRequestData("TaxFreeAmt",	requestData.get("TaxFreeAmt"));
			}
				
			connector.addRequestData("actionType", "PY0");
			connector.addRequestData("PayMethod", "BILL");
			connector.requestAction();
					
			String resultCode	= connector.getResultData("ResultCode");
			String resultMsg	= connector.getResultData("ResultMsg");
			String tid			= connector.getResultData("TID");
			String authDate		= connector.getResultData("AuthDate");
			String authCode		= connector.getResultData("AuthCode");
			String cardCode		= connector.getResultData("CardCode");
			String cardName		= connector.getResultData("CardName");
			String cardNo		= connector.getResultData("CardNo");
			
			result.put("ResultMsg", resultMsg);
			result.put("ResultCode", resultCode);
			
		}catch(Exception e){
			result.put("ResultMsg", e.getMessage());
			result.put("ResultCode", "9999");
		}
		
		System.out.println(result.get("ResultMsg"));
		
		return result;
	}
}

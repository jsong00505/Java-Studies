package jsong00505.nicepay.sample;

import java.util.HashMap;

import kr.co.nicepay.module.lite.NicePayWebConnector;

public class NicepayOnetimeBillingProcess {

	public static HashMap<String, String> doBilling(HashMap<String, String> requestData) {
		NicePayWebConnector	connector;
		HashMap<String, String> result = new HashMap<String, String>();
		
		try{
			connector = new NicePayWebConnector();
			connector.setNicePayHome(requestData.get("SERVER_HOME_PATH"));			// nicepay.properties 위치 기술	
			
			connector.addRequestData("EncodeKey",	requestData.get("EncodeKey"));	// 상점키			            
				
			connector.addRequestData("BillKey",		requestData.get("BillKey"));	// 빌키			
			connector.addRequestData("MID",			requestData.get("MID"));		// 상점 아이디			
			connector.addRequestData("Moid",		requestData.get("Moid"));		// 주문번호			
			connector.addRequestData("Amt",			requestData.get("Amt"));		// 결제 금액			
			connector.addRequestData("GoodsName",	requestData.get("GoodsName"));	// 상품명			
			connector.addRequestData("BuyerName",	requestData.get("BuyerName"));	// 구매자
			connector.addRequestData("BuyerTel",	requestData.get("BuyerTel"));	// 구매자 전화번호
			connector.addRequestData("BuyerEmail",	requestData.get("BuyerEmail"));	// 구매자 E-Mail			
			connector.addRequestData("MallIP",		requestData.get("MallIP"));		// 몰 IP
			
			// 할부 설정
			connector.addRequestData("CardInterest",requestData.get("CardInterest"));	// 무이자 여부  0: 일반, 1:무이자
			connector.addRequestData("CardQuota",	requestData.get("CardQuota"));	// 할부 개월수 일시불 : 00 ,2개월 :02
		
			if("Y".equals(requestData.get("AdditionalFee"))) {
				connector.addRequestData("SupplyAmt",	requestData.get("SupplyAmt"));	// 공급가액			
				connector.addRequestData("GoodsVat",	requestData.get("GoodsVat"));	// 부가세			
				connector.addRequestData("ServiceAmt",	requestData.get("ServiceAmt"));	// 봉사료			
				connector.addRequestData("TaxFreeAmt",	requestData.get("TaxFreeAmt"));	// 면세
			}
			
												
			// 고정값
			connector.addRequestData("actionType", "PY0");              // 고정, 수정금지
			connector.addRequestData("PayMethod", "BILL");              // 고정, 수정금지
			connector.requestAction();
					
			String resultCode	= connector.getResultData("ResultCode");	// 결과코드 (성공 :3001 ,이외 실패)
			String resultMsg	= connector.getResultData("ResultMsg");		// 결과 메시지
			String tid			= connector.getResultData("TID");				// 거래 아이디
			String authDate		= connector.getResultData("AuthDate");		// 승인 날짜
			String authCode		= connector.getResultData("AuthCode");		// 승인 번호
			String cardCode		= connector.getResultData("CardCode");		// 카드사코드
			String cardName		= connector.getResultData("CardName");		// 카드사명
			String cardNo		= connector.getResultData("CardNo");			// 카드번호
			
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

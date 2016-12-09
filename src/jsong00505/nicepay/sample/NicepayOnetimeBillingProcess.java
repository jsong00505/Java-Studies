package jsong00505.nicepay.sample;

import java.util.HashMap;

import kr.co.nicepay.module.lite.NicePayWebConnector;

public class NicepayOnetimeBillingProcess {

	public static HashMap<String, String> doBilling(HashMap<String, String> requestData) {
		NicePayWebConnector	connector;
		HashMap<String, String> result = new HashMap<String, String>();
		
		try{
			connector = new NicePayWebConnector();
			connector.setNicePayHome(requestData.get("SERVER_HOME_PATH"));			// nicepay.properties ��ġ ���	
			
			connector.addRequestData("EncodeKey",	requestData.get("EncodeKey"));	// ����Ű			            
				
			connector.addRequestData("BillKey",		requestData.get("BillKey"));	// ��Ű			
			connector.addRequestData("MID",			requestData.get("MID"));		// ���� ���̵�			
			connector.addRequestData("Moid",		requestData.get("Moid"));		// �ֹ���ȣ			
			connector.addRequestData("Amt",			requestData.get("Amt"));		// ���� �ݾ�			
			connector.addRequestData("GoodsName",	requestData.get("GoodsName"));	// ��ǰ��			
			connector.addRequestData("BuyerName",	requestData.get("BuyerName"));	// ������
			connector.addRequestData("BuyerTel",	requestData.get("BuyerTel"));	// ������ ��ȭ��ȣ
			connector.addRequestData("BuyerEmail",	requestData.get("BuyerEmail"));	// ������ E-Mail			
			connector.addRequestData("MallIP",		requestData.get("MallIP"));		// �� IP
			
			// �Һ� ����
			connector.addRequestData("CardInterest",requestData.get("CardInterest"));	// ������ ����  0: �Ϲ�, 1:������
			connector.addRequestData("CardQuota",	requestData.get("CardQuota"));	// �Һ� ������ �Ͻú� : 00 ,2���� :02
		
			if("Y".equals(requestData.get("AdditionalFee"))) {
				connector.addRequestData("SupplyAmt",	requestData.get("SupplyAmt"));	// ���ް���			
				connector.addRequestData("GoodsVat",	requestData.get("GoodsVat"));	// �ΰ���			
				connector.addRequestData("ServiceAmt",	requestData.get("ServiceAmt"));	// �����			
				connector.addRequestData("TaxFreeAmt",	requestData.get("TaxFreeAmt"));	// �鼼
			}
			
												
			// ������
			connector.addRequestData("actionType", "PY0");              // ����, ��������
			connector.addRequestData("PayMethod", "BILL");              // ����, ��������
			connector.requestAction();
					
			String resultCode	= connector.getResultData("ResultCode");	// ����ڵ� (���� :3001 ,�̿� ����)
			String resultMsg	= connector.getResultData("ResultMsg");		// ��� �޽���
			String tid			= connector.getResultData("TID");				// �ŷ� ���̵�
			String authDate		= connector.getResultData("AuthDate");		// ���� ��¥
			String authCode		= connector.getResultData("AuthCode");		// ���� ��ȣ
			String cardCode		= connector.getResultData("CardCode");		// ī����ڵ�
			String cardName		= connector.getResultData("CardName");		// ī����
			String cardNo		= connector.getResultData("CardNo");			// ī���ȣ
			
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

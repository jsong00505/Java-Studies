package jsong00505.nicepay.sample;

import java.util.HashMap;
import java.util.Iterator;

import kr.co.nicepay.module.lite.NicePayWebConnector;
import kr.co.nicevan.nicepay.adapter.etc.HttpServletRequestMock;
import kr.co.nicevan.nicepay.adapter.etc.HttpServletResponseMock;
import kr.co.nicevan.nicepay.adapter.web.NicePayHttpServletRequestWrapper;
import kr.co.nicevan.nicepay.adapter.web.NicePayWEB;
import kr.co.nicevan.nicepay.adapter.web.dto.WebMessageDTO;

public class NicepayTxRequest {
	public HashMap<String, String> doRequest(HashMap<String, String> reqMap) {
		
		HashMap<String, String> resMap = new HashMap<>();
		
		try{
			
			HttpServletRequestMock request = new HttpServletRequestMock();
			HttpServletResponseMock response = new HttpServletResponseMock();

			/** Request Wrapper  */
			NicePayHttpServletRequestWrapper httpRequestWrapper = new NicePayHttpServletRequestWrapper();
			
			
			httpRequestWrapper.addParameter("GoodsName",reqMap.get("GoodsName"));
			httpRequestWrapper.addParameter("Amt", reqMap.get("Amt"));
			httpRequestWrapper.addParameter("BuyerName", reqMap.get("BuyerName"));
			httpRequestWrapper.addParameter("BuyerEmail", reqMap.get("BuyerEmail"));
			httpRequestWrapper.addParameter("BuyerTel",reqMap.get("BuyerTel"));
			httpRequestWrapper.addParameter("GoodsCnt", reqMap.get("GoodsCnt"));
			httpRequestWrapper.addParameter("BuyerAddr", reqMap.get("BuyerAddr"));
			httpRequestWrapper.addParameter("Moid", reqMap.get("Moid"));	
			httpRequestWrapper.addParameter("MallUserID", reqMap.get("MallUserID"));
			httpRequestWrapper.addParameter("MallReserved", reqMap.get("MallReserved"));
							
			httpRequestWrapper.addParameter("MID", reqMap.get("MID"));
			httpRequestWrapper.addParameter("MallIP", reqMap.get("MallIP"));
			
			httpRequestWrapper.addParameter("CardExpire", reqMap.get("CardExpire"));
			httpRequestWrapper.addParameter("CardInterest", reqMap.get("CardInterest"));
			httpRequestWrapper.addParameter("CardQuota", reqMap.get("CardQuota"));
			httpRequestWrapper.addParameter("CardNo", reqMap.get("CardNo"));
			httpRequestWrapper.addParameter("CardPwd", reqMap.get("CardPwd"));
			httpRequestWrapper.addParameter("BuyerAuthNum",reqMap.get("BuyerAuthNum")); 
			httpRequestWrapper.addParameter("CardPoint",reqMap.get("CardPoint"));
			
			/** 고정값 사용 */
			httpRequestWrapper.addParameter("TransType", reqMap.get("TransType"));
			httpRequestWrapper.addParameter("actionType", reqMap.get("actionType"));
			httpRequestWrapper.addParameter("AuthFlg", reqMap.get("AuthFlg"));
			httpRequestWrapper.addParameter("CharSet", reqMap.get("CharSet"));
					
			/** 2. NicePayWeb */
			NicePayWEB nicepayWEB = new NicePayWEB();

			/** 2-1. set log path */
			nicepayWEB.setParam("NICEPAY_LOG_HOME", "C:/logs");

			/** 2-2. application logging option (0: DISABLE, 1: ENABLE) */
			nicepayWEB.setParam("APP_LOG", "1");

			/** 2-3. event logging option (0: DISABLE, 1: ENABLE) */
			nicepayWEB.setParam("EVENT_LOG", "1");

			/** 2-4. log mode (N: plain text, S: encrypted text) */
			nicepayWEB.setParam("EncFlag", "S");

			/** 2-5. service mode(authorization : PY0 , cancellation  : CL0) */
			nicepayWEB.setParam("SERVICE_MODE", "PY0");

			/** 2-6. currency   */
			nicepayWEB.setParam("Currency", "KRW");

			/** 2-7. pay method (CARD, BANK, VBANK) */
			nicepayWEB.setParam("PayMethod", "CARD");
			
			/** 2-8 validation key */
			nicepayWEB.setParam("EncodeKey", reqMap.get("LicenseKey"));
			
		
			/** 3. do request */
			WebMessageDTO result = nicepayWEB.doService(httpRequestWrapper, response);			
			
			for(Iterator<String> iter = result.keys(); iter.hasNext(); ) {
				String temp = iter.next();
				resMap.put(temp, result.getParameter(temp));
				System.out.println(temp + " : " + result.getParameter(temp));
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return resMap;
	}
	
}

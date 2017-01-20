package jsong00505.nicepay.sample;

import java.util.HashMap;
import java.util.Iterator;

import kr.co.nicevan.nicepay.adapter.etc.HttpServletRequestMock;
import kr.co.nicevan.nicepay.adapter.etc.HttpServletResponseMock;
import kr.co.nicevan.nicepay.adapter.web.NicePayHttpServletRequestWrapper;
import kr.co.nicevan.nicepay.adapter.web.NicePayWEB;
import kr.co.nicevan.nicepay.adapter.web.dto.WebMessageDTO;

public class NicepayTxCancelRequest {
	public HashMap<String, String> doRequest(HashMap<String, String> reqMap) {
		HashMap<String, String> resMap = new HashMap<>();
try{
			
			HttpServletRequestMock request = new HttpServletRequestMock();
			HttpServletResponseMock response = new HttpServletResponseMock();

			/** Request Wrapper  */
			NicePayHttpServletRequestWrapper httpRequestWrapper = new NicePayHttpServletRequestWrapper();
			
			httpRequestWrapper.addParameter("MID", reqMap.get("MID"));
			httpRequestWrapper.addParameter("Moid", reqMap.get("Moid"));
			httpRequestWrapper.addParameter("TID", reqMap.get("TID"));
			httpRequestWrapper.addParameter("CancelAmt", reqMap.get("CancelAmt"));
			httpRequestWrapper.addParameter("CancelMsg", reqMap.get("CancelMsg"));
			httpRequestWrapper.addParameter("CancelPwd", reqMap.get("CancelPwd"));
			httpRequestWrapper.addParameter("PartialCancelCode", reqMap.get("PartialCancelCode"));
			httpRequestWrapper.addParameter("requestPgIp", reqMap.get("requestPgIp"));
			httpRequestWrapper.addParameter("requestPgPort", reqMap.get("requestPgPort"));
			
					
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
			nicepayWEB.setParam("SERVICE_MODE", "CL0");
			
		
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

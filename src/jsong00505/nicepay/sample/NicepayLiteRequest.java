package jsong00505.nicepay.sample;

import java.util.HashMap;

import kr.co.nicepay.module.lite.NicePayWebConnector;
import kr.co.nicevan.nicepay.adapter.etc.HttpServletRequestMock;
import kr.co.nicevan.nicepay.adapter.etc.HttpServletResponseMock;
import kr.co.nicevan.nicepay.adapter.web.NicePayHttpServletRequestWrapper;

public class NicepayLiteRequest {

	public HashMap<String, String> doCancelRequest(HashMap<String, String> reqMap) {
		HashMap<String, String> resMap = new HashMap<>();
		System.out.println(reqMap.toString());
		try{
			NicePayWebConnector connector = new NicePayWebConnector();

			// 1. 로그 디렉토리 생성
			connector.setNicePayHome(reqMap.get("NicePayHome"));

			// 2. 요청 페이지 파라메터 셋팅
			//connector.setRequestData(request);
			for(String key: reqMap.keySet()) {
				connector.addRequestData(key, reqMap.get(key));
			}
			
			connector.requestAction();

			resMap.put("ResultCode", connector.getResultData("ResultCode"));
			resMap.put("ResultMsg", connector.getResultData("ResultMsg"));
			
			System.out.println(connector.getResultData("ResultCode"));
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return resMap;
	}
}

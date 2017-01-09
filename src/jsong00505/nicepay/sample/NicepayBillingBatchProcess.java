package jsong00505.nicepay.sample;

import java.util.HashMap;

import jsong.common.utils.CommonConstants;
import jsong00505.core.utils.HTTPUtil;
import jsong00505.core.utils.JSONUtil;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NicepayBillingBatchProcess {
	public static String reqURI = "";
	HTTPUtil conn = null;
	
	private static Logger log = LoggerFactory.getLogger(NicepayBillingBatchProcess.class);
	
	public NicepayBillingBatchProcess() {
		reqURI = CommonConstants.NICEPAY_REAL_DOMAIN_URI;
		reqURI += CommonConstants.NICEPAY_BILLING_UPLOAD_API_PATH;
	}
	
	public NicepayBillingBatchProcess(String ReqType) {
		System.out.println("ReqType: " + ReqType);
		if("REAL".equals(ReqType)) {
			reqURI = CommonConstants.NICEPAY_REAL_DOMAIN_URI;
		} else if("STAGING".equals(ReqType)) {
			reqURI = CommonConstants.NICEPAY_STAGING_DOMAIN_URI;
		} else if("DEV".equals(ReqType)) {
			reqURI = CommonConstants.NICEPAY_DEV_DOMAIN_URI;
		} else {
			reqURI = CommonConstants.NICEPAY_REAL_DOMAIN_URI;
		}
		reqURI += CommonConstants.NICEPAY_BILLING_UPLOAD_API_PATH;
		System.out.println("reqURI: " + reqURI);
	}
	public String doBillingBatchRequest(HashMap<String, String> reqObjData, HashMap<String, JSONObject> reqArrData) {
		String result = "";
		
		JSONUtil jsonUtil = new JSONUtil();
		JSONObject reqJSONObj = new JSONObject();
		JSONArray reqJSONArr = new JSONArray();
		
		HashMap<String, String> reqMap = new HashMap<>();
		
		reqJSONObj = jsonUtil.makeHashMapToJSONObject(reqObjData);
		reqJSONArr = jsonUtil.makeHashMapToJSONArray(reqArrData);
		
		reqJSONObj.put("reqData", reqJSONArr);
		
		System.out.println(reqJSONObj.toJSONString());
		
		reqMap.put("m", reqJSONObj.toJSONString());
		
		conn = new HTTPUtil(reqURI);
		conn.setActionUrl(reqURI);
		System.out.println(reqURI);
		try {
			result = conn.send(log, reqMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}

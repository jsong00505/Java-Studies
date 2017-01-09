package jsong00505.nicepay.sample.test;

import java.util.HashMap;

import jsong00505.core.utils.HTTPUtil;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HTTPUtilTest {
	private static Logger log = LoggerFactory.getLogger(HTTPUtil.class);
	@Test
	public void testRequest() {
		String url = "https://web.nicepay.co.kr";
		HashMap<String, String> reqMap = new HashMap<>();
		
		HTTPUtil conn = new HTTPUtil();
		conn.setActionUrl(url);
		try {
			String result = conn.send(log, reqMap);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package jsong00505.nicepay.sample.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.HashMap;

import jsong00505.nicepay.sample.NicepayOnetimeBillingProcess;

import org.junit.Test;

public class OnetimeBillingTest {

	//@Test
	public void test_yswater() {
		HashMap<String, String> requestData = new HashMap<String, String>();
		HashMap<String, String> resultData = new HashMap<String, String>();
		
		requestData.put("SERVER_HOME_PATH", "C:\\Users\\WES\\workspace\\LeetCode\\properties");

		requestData.put("AdditionalFee", "N");
		
		requestData.put("EncodeKey",	"1bATR7yaUl0DyNu/5eZhexUkXoyAqB6wkrIKYDJRk83k+7zyZEn8SICQQO/coj7nWyrXPhbu3//NXpVTYksXzg==");
		requestData.put("BillKey",		"");
		requestData.put("MID",			"yswater02m");
		requestData.put("Moid",			"187339");
		requestData.put("Amt",			"1004");
		requestData.put("GoodsName",	"billing_test");
		requestData.put("BuyerName",	"최종권");
		requestData.put("BuyerTel",		"01036214223");
		requestData.put("BuyerEmail",	"");
		requestData.put("MallIP",		"127.0.0.1");
		
		// 할부 설정
		requestData.put("CardInterest",	"0");
		requestData.put("CardQuota",	"00");
		
		if("Y".equals(requestData.get("AdditionalFee"))) {
			requestData.put("SupplyAmt",	"900");
			requestData.put("GoodsVat",		"104");			
			requestData.put("ServiceAmt",	"0");
			requestData.put("TaxFreeAmt",	"0");
		}

		resultData = NicepayOnetimeBillingProcess.doBilling(requestData);
		
		if("3001".equals(resultData.get("ResultCode"))) {
			assertTrue(true);
		} else {
			fail("Payment failed");
			
		}

	}
	
	@Test
	public void test_jsong() {
		HashMap<String, String> requestData = new HashMap<String, String>();
		HashMap<String, String> resultData = new HashMap<String, String>();
		
		requestData.put("SERVER_HOME_PATH", "C:\\Users\\WES\\workspace\\LeetCode\\properties");

		requestData.put("AdditionalFee", "N");
		
		requestData.put("EncodeKey",	"b+zhZ4yOZ7FsH8pm5lhDfHZEb79tIwnjsdA0FBXh86yLc6BJeFVrZFXhAoJ3gEWgrWwN+lJMV0W4hvDdbe4Sjw==");
		requestData.put("BillKey",		"BIKYnictest04m1612091730313663");
		requestData.put("MID",			"nictest04m");
		requestData.put("Moid",			MicroTimestamp.INSTANCE.get());
		requestData.put("Amt",			"1004");
		requestData.put("GoodsName",	"billing_test");
		requestData.put("BuyerName",	"nice_tester");
		requestData.put("BuyerTel",		"01036214223");
		requestData.put("BuyerEmail",	"");
		requestData.put("MallIP",		"127.0.0.1");
		
		// 할부 설정
		requestData.put("CardInterest",	"0");
		requestData.put("CardQuota",	"0");
		
		if("Y".equals(requestData.get("AdditionalFee"))) {
			requestData.put("SupplyAmt",	"900");
			requestData.put("GoodsVat",		"104");			
			requestData.put("ServiceAmt",	"0");
			requestData.put("TaxFreeAmt",	"0");
		}

		resultData = NicepayOnetimeBillingProcess.doBilling(requestData);
		
		if("3001".equals(resultData.get("ResultCode"))) {
			assertTrue(true);
		} else {
			fail("Payment failed");
			
		}

	}
	
	public enum MicroTimestamp {
		INSTANCE;

		private long startDate;
		private long startNanoseconds;
		private SimpleDateFormat dateFormat;

		private MicroTimestamp() {
			this.startDate = System.currentTimeMillis();
			this.startNanoseconds = System.nanoTime();
			this.dateFormat = new SimpleDateFormat("yyMMddHHmmssSSS");
		}

		public String get() {
			long microSeconds = (System.nanoTime() - this.startNanoseconds) / 1000;
			long date = this.startDate + (microSeconds / 1000);
			return this.dateFormat.format(date) + String.format("%03d", microSeconds % 1000);
		}
	}

}

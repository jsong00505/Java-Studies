package jsong00505.study.test.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;



import jsong00505.core.utils.CheckStringFormat;
import jsong00505.core.utils.ReverseString;

import org.junit.Test;

public class JsongUtilsTest {
	//@Test
	public void URLEncodeTest() throws UnsupportedEncodingException {
		String encodingString1 ="Ksd/OVqaDtHTTTA+vXBC35/GJrU7Z7EYHfe8TYE6Cu9bYxalG/EA4v3o+aA/MWLoGIAe7dm2bUXl+rCF8PEjnQ==";
		String case2 = "5fDl797cTER2itvddSelWX%2BKa6G%2BmlcFqARg3y06wrvNSuK3kdJM6mob29O0wPGt%0AgA3KwWFU4fjzedabLZ3F1noHXSamMGZrvLKm9MlEsSFmSrEALjRXrW%2BWOpuOAimq%0An3rCrjfFC54u%2F1EYtzZGcNSw%2BTLj2wqohwLphHq9jzs1wFEmjtPx6E%2BLAiBR4Lal%0AcU%2BORanFt%2F%2FHeRQyPRasBVgzVs%2BO1YWp9L9dBcrbmNwoDrUvtxGvmJzO2Iffk1x0%0AGoq9fUFSKGZaGXWTb8FkI%2FN07kwUrQ4DWXR7YXvKYdA%3D%0A";
		
		
		String charsetName = "EUC-KR";
		String encodeResult = URLEncoder.encode(encodingString1, charsetName);
		System.out.println("ENCODE1: " + encodeResult);
		System.out.println("ENCODE2: " + URLEncoder.encode(case2, charsetName));
	}
	
	//@Test
	public void URLDecodeTest() throws UnsupportedEncodingException {
		String decodingString ="Ksd%2FOVqaDtHTTTA%2BvXBC35%2FGJrU7Z7EYHfe8TYE6Cu9bYxalG%2FEA4v3o%2BaA%2FMWLoGIAe7dm2bUXl%2BrCF8PEjnQ%3D%3D";
		String case2 = "5fDl797cTER2itvddSelWX%2BKa6G%2BmlcFqARg3y06wrvNSuK3kdJM6mob29O0wPGt%0AgA3KwWFU4fjzedabLZ3F1noHXSamMGZrvLKm9MlEsSFmSrEALjRXrW%2BWOpuOAimq%0An3rCrjfFC54u%2F1EYtzZGcNSw%2BTLj2wqohwLphHq9jzs1wFEmjtPx6E%2BLAiBR4Lal%0AcU%2BORanFt%2F%2FHeRQyPRasBVgzVs%2BO1YWp9L9dBcrbmNwoDrUvtxGvmJzO2Iffk1x0%0AGoq9fUFSKGZaGXWTb8FkI%2FN07kwUrQ4DWXR7YXvKYdA%3D%0A";
		String case3 = "%2FFiVcF%2Bx2FZH80kjT%2BR9L915YkGP1TMJVU5hOMpneA8%3D";
		
		String charsetName = "UTF-8";
		String decodeResult = URLDecoder.decode(decodingString, charsetName);
		System.out.println("DECODE1: " + decodeResult);
		System.out.println("DECODE2: " + URLDecoder.decode(case2, charsetName));
		System.out.println("DECODE3: " + URLDecoder.decode(case3, charsetName));
	}
	/*
	 * reference: https://www.lesstif.com/pages/viewpage.action?pageId=14745703
	 * >> this source doesn't work so far by 01/11/16
	 */
	//@Test
	public void CURLTest() throws IOException {
		StringBuilder cURLQuery = new StringBuilder();
		String destUrl = "https://staging.nicepay.co.kr/api/chackBankAccount.jsp";
		String mid = "alnd00001m";
		String merchantKey = "Ksd/OVqaDtHTTTA+vXBC35/GJrU7Z7EYHfe8TYE6Cu9bYxalG/EA4v3o+aA/MWLoGIAe7dm2bUXl+rCF8PEjnQ==";
		String inAcocunt = "40400204157870";
		String inBankCode = "004";
		StringBuilder output = new StringBuilder();

		cURLQuery.append("curl ");
		cURLQuery.append(destUrl).append("?");
		cURLQuery.append("mid=").append(mid).append("&");
		cURLQuery.append("merchantKey=").append(merchantKey).append("&");
		cURLQuery.append("inAcocunt=").append(inAcocunt).append("&");
		cURLQuery.append("inBankCode=").append(inBankCode);
		System.out.println("QUERY: " + cURLQuery.toString());
		try {
			Process p = Runtime.getRuntime().exec(cURLQuery.toString());

			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n"); 
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR: " + e);
		}
		System.out.println("OUTPUT::: "+output.toString());
	}
	
	/*
	 * How to make char to String
	 * ----------------------------
	 * String.valueOf('c') : most efficient
	 * Character.toString('c')
	 * new Character.toString('c')
	 * "" + 'c'
	 */
	//@Test
	public void stringCharAtTest() {
		String str = "Hello World!";
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("H", 1);
		StringBuilder sb = new StringBuilder();
		sb.append("b: ").append(str.charAt(0));
		
		System.out.println("charAt: " + "A".charAt(0));
		System.out.println(hm.get(new Character(str.charAt(0)).toString()));
		System.out.println(sb.toString());
	}
	
	//@Test
	public void integerToStringTest() {
		int x = -123;
		boolean negFlag = false;
		if(x < 0) {
			negFlag = true;
		}
		x = Math.abs(x);
		String strX = Integer.toString(x);
		System.out.println(ReverseString.reverseString(strX));
	}
	
	@Test
	public void stringFormatTest() {
		String case1 = "111111111111111";
		String case2 = "1111111111111111111a";
		String case3 = "-1111111111111111111";
		String case4 = " ";
		String case5 = "NOINT";
		
		
		System.out.println("Case1 is Numeric? "+ CheckStringFormat.isNumericString(case1));
		System.out.println("Case2 is Numeric? "+ CheckStringFormat.isNumericString(case2));
		System.out.println("Case3 is Numeric? "+ CheckStringFormat.isNumericString(case3));
		System.out.println(" ".equals(""+case4.charAt(0)));
		System.out.println("Case5 is AlphaNumeric? "+ CheckStringFormat.isAlphaNumericString(case5));
		
	}
}

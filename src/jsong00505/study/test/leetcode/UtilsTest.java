package jsong00505.study.test.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.junit.Test;

public class UtilsTest {
	//@Test
	public void URLEncodeTest() throws UnsupportedEncodingException {
		String encodingString ="Ksd/OVqaDtHTTTA+vXBC35/GJrU7Z7EYHfe8TYE6Cu9bYxalG/EA4v3o+aA/MWLoGIAe7dm2bUXl+rCF8PEjnQ==";
		String charsetName = "EUC-KR";
		String encodeResult = URLEncoder.encode(encodingString, charsetName);
		System.out.println("ENCODE: " + encodeResult);
	}
	
	//@Test
	public void URLDecodeTest() throws UnsupportedEncodingException {
		String decodingString ="Ksd%2FOVqaDtHTTTA%2BvXBC35%2FGJrU7Z7EYHfe8TYE6Cu9bYxalG%2FEA4v3o%2BaA%2FMWLoGIAe7dm2bUXl%2BrCF8PEjnQ%3D%3D";
		String charsetName = "UTF-8";
		String decodeResult = URLDecoder.decode(decodingString, charsetName);
		System.out.println("DECODE: " + decodeResult);
	}
	/*
	 * reference: https://www.lesstif.com/pages/viewpage.action?pageId=14745703
	 * >> this source doesn't work so far by 01/11/16
	 */
	@Test
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
}

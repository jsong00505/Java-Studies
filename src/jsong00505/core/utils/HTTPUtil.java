package jsong00505.core.utils;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HTTPUtil {

	private static int CONNECTION_TIMEOUT = 5000;

	private static int RECEIVE_TIMEOUT = 15000;
	
	private String pid = null;
	
	private String encoding = "euc-kr";
	
	private String actionUrl = null;

	public HTTPUtil() {
		this.pid = "0";
	}
	
	public HTTPUtil(String pid) {
		this.pid = pid;
	}
	
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	
	public String send(Logger log, String sendData) throws Exception {

		HttpURLConnection conn			= null;
		BufferedReader resultReader		= null;
		PrintWriter pw					= null;
		URL url 						= null;
		
		int statusCode = 0;
		StringBuffer sendBuffer = new StringBuffer();
		StringBuffer recvBuffer = new StringBuffer();
		try {
			System.out.println("REQUEST URL:[{}]" + actionUrl);
			System.out.println("REQUEST DATA:[{}]" + sendData);

			sendBuffer.append("m=").append(URLEncoder.encode(sendData, encoding));
			
			url = new URL(actionUrl);
			conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("POST");
			conn.setConnectTimeout(CONNECTION_TIMEOUT);
			conn.setReadTimeout(RECEIVE_TIMEOUT);
			conn.setDoOutput(true);
			
			pw = new PrintWriter(conn.getOutputStream());
			pw.write(sendBuffer.toString());
			pw.flush();
			
			statusCode = conn.getResponseCode();
			System.out.println("RESPONSE CODE: " + statusCode);
			resultReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			for(String temp; (temp = resultReader.readLine()) != null;) {
				recvBuffer.append(temp).append("\n");
			}
			System.out.println("RESPONSE DATA:[{}]" + recvBuffer.toString().trim());
//			log.debug(pid + "RESPONSE > " + new String(recvBuffer.toString().getBytes(), "euc-kr"));
			
			if(!(statusCode == HttpURLConnection.HTTP_OK)) {
				throw new HTTPUtilException("SERVER RESPONSE ERROR / " + statusCode);
			}
			
			return recvBuffer.toString().trim();
			
		} catch (Exception e) {
			throw new HTTPUtilException("HTTP CONNECTION ERROR / " + e.getMessage()
					+ "\nREQUEST URL  : " + actionUrl
					+ "\nREQUEST PARAM: " + sendData
					+ "\nRESPONSE DATA: " + recvBuffer.toString());
		} finally {
			recvBuffer.setLength(0);
			sendBuffer.setLength(0);
			
			try {
				if (resultReader != null) {
					resultReader.close();
				}
			} catch (Exception ex) {
				resultReader = null;
			}

			try {
				if (pw != null) {
					pw.close();
				}
			} catch (Exception ex) {
				pw = null;
			}
			
			try {
				if (conn != null) {
					conn.disconnect();
				}
			} catch (Exception ex) {
				conn = null;
			}
		}
	}

	public String send(Logger log, HashMap<String, String> request) throws Exception {
		
		String serializeString = ParseUtil.parseMapToString(request);
		return send(log, serializeString);
	}
}

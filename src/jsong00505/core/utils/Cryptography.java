package jsong00505.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Encoder;

public class Cryptography {
	
	MessageDigest md;
	String strSRCData = "";
	String strENCData = "";
	String strOUTData = "";
	
	public Cryptography() {
		if(Security.getProvider("BC") == null) {
			
		}
	}
	
	public String encryptSeedToString(String src, String seedKey, String iv) throws Exception {
		return "";
	}
	
	public String sha256Encrypt(String strData) { // ��ȣȭ ��ų ������
		String passACL = null;

		MessageDigest md = null;

		try {
			md = MessageDigest.getInstance("SHA-256");
			md.reset();
			md.update(strData.getBytes());
			byte[] raw = md.digest();
			byte[] encodedBytes = Base64.encodeBase64(raw);
			passACL = new String(encodedBytes);
			
		} catch(Exception e) {
			System.out.print("��ȣȭ ����" + e.toString());
	    }
		
		return passACL;	// ��ȣȭ�� �����͸� ����...
	}
	
	public String sha256Encrypt2(String strData) {
		String hashdata = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256"); 
			md.update(strData.getBytes());
			
			byte[] digest = md.digest();

			BASE64Encoder encoder = new BASE64Encoder();

			hashdata = encoder.encode(digest);

		} catch (NoSuchAlgorithmException e) {
				
		}
		return hashdata;
	}

}

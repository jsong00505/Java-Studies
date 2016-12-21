package jsong00505.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

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
	
	public String sha256Encrypt(String strData) { // 암호화 시킬 데이터
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
			System.out.print("암호화 에러" + e.toString());
	    }
		
		return passACL;	// 암호화된 데이터를 리턴...
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
	
	public String sha256HexEncrypt(String hashParam) throws Exception{

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(hashParam.getBytes());

		byte[] md5Sig = md.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < md5Sig.length; i++) {
			String hex=Integer.toHexString(0xff & md5Sig[i]);
				if(hex.length()==1) sb.append('0');
				sb.append(hex);
		}
		return sb.toString();
	}
	
	public String sha256HexEncrypt2(String str){
		String passACL = null;

		MessageDigest md = null;

		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch(Exception e) {
			//e.printStackTrace();
		}

		md.reset();
		md.update(str.getBytes());
		byte[] raw = md.digest();

		passACL = encodeHex(raw);
		
		return passACL;
	}

	public String encodeHex(byte [] b){
		char [] c = Hex.encodeHex(b);
		return new String(c);
	}

}

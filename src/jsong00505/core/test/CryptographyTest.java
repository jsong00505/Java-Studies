package jsong00505.core.test;

import org.junit.Test;

import jsong00505.core.utils.Cryptography;



public class CryptographyTest {
	String edi = "20170113152940";
	String mid = "niceziki1m";
	String amt = "1000";
	String mkey = "YPKsZBEUihCptVNoM9c3sWhurHXeWXzUgqwiKl+UkxNy7wNdpmEf+DYP4T5mE0FMvMFG+zuzhG7vqJU281Ikbw==";
	
	String ptext = edi + mid + amt + mkey;
	@Test
	public void sha256HashTest() {
		
		System.out.println(":::SHA-256 HASH TEST:::");
		
		Cryptography c = new Cryptography();

		
		System.out.println("SHA-256: "+c.sha256Encrypt(ptext));
		System.out.println("SHA-256 2: "+c.sha256Encrypt2(ptext));
		
	}
	
	//@Test
	public void sha256HexHashTest() throws Exception {
		String str = "hello";
		
		Cryptography c = new Cryptography();
		
		System.out.println("SHA-256: "+c.sha256HexEncrypt(str));
		System.out.println("SHA-256 2: "+c.sha256HexEncrypt2(str));
		
	}
	
	@Test
	public void md5HexBaseHashTest() throws Exception {
		
		Cryptography c = new Cryptography();
		
		System.out.println("MD-5: "+c.md5HexBaseEncrypt(ptext));

		
	}
}

package jsong00505.core.test;

import org.junit.Test;

import jsong00505.core.utils.Cryptography;



public class CryptographyTest {
	@Test
	public void sh256HashTest() {
		String str = "20161219161112lottewd01m10000rW/9BpWt+0YToW9yu1UQPij/GgZWx7nIThIKXMAct1pq2WIIWqQh8x+B2ebg1vpa1e7QgxqYLQUx+YoxktPKRw==";
		System.out.println(":::LONGEST PALINDROME TEST:::");
		
		Cryptography c = new Cryptography();
		System.out.println("SHA-256: "+c.sha256Encrypt(str));
		
	}
}

package jsong00505.core.utils;

import java.security.Security;

public class Cryptography {
	public Cryptography() {
		if(Security.getProvider("BC") == null) {
			
		}
	}
	
	public String encryptSeedToString(String src, String seedKey, String iv) throws Exception {
		return "";
	}

}

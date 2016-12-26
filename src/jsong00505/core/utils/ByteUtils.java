package jsong00505.core.utils;

public class ByteUtils {
	public String convertBinaryToHex(byte[] buf) {		
		StringBuffer result = new StringBuffer();
		
		for (byte b : buf) {
		    result.append(String.format("%02X ", b));
		    result.append(" "); // delimiter
		}
		return result.toString();
	}
}

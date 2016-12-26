package jsong00505.core.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CharacterEncoding {
	// Create the encoder and decoder for ISO-8859-1
	Charset charset = Charset.forName("EUC-KR");
	CharsetDecoder decoder = charset.newDecoder();
	CharsetEncoder encoder = charset.newEncoder();
	
	public String convertEuckrToUtf8(String str) {
		String returnStr = "";
		try {
		    // Convert a string to ISO-LATIN-1 bytes in a ByteBuffer
		    // The new ByteBuffer is ready to be read.
		    ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(str));
		    System.out.println("BEFORE: " + bbuf.toString());
		    // Convert ISO-LATIN-1 bytes in a ByteBuffer to a character ByteBuffer and then to a string.
		    // The new ByteBuffer is ready to be read.
		    CharBuffer cbuf = decoder.decode(bbuf);
		    System.out.println("AFTER: " + cbuf.toString());
		    returnStr = cbuf.toString();
		} catch (CharacterCodingException e) {
			
		}
		
		return returnStr;
	}

}

package jsong00505.core.test;

import jsong00505.core.utils.CharacterEncoding;

import org.junit.Test;

public class CharacterEncodingTest {
	@Test
	public void testRequest() {
		CharacterEncoding charEnc = new CharacterEncoding();
		System.out.println(charEnc.convertEuckrToUtf8("신한"));
	}
}

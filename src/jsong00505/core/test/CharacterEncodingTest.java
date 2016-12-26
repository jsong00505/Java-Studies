package jsong00505.core.test;

import java.io.UnsupportedEncodingException;

import jsong00505.core.utils.ByteUtils;
import jsong00505.core.utils.CharacterEncoding;

import org.junit.Test;

public class CharacterEncodingTest {
	//@Test
	public void testRequest() {
		CharacterEncoding charEnc = new CharacterEncoding();
		System.out.println(charEnc.convertEuckrToUtf8("신한"));
	}
	
	@Test
	public void localTest() {
		ByteUtils bu = new ByteUtils();
		

		
		try {
			String name = new String("이름");
			byte[] strs = name.getBytes("euc-kr");
			System.out.println("len: " + strs.length);
			System.out.println("hex: " + bu.convertBinaryToHex(strs));
			System.out.println("val: " + new String(strs));
			System.out.println();
			
			strs = name.getBytes("utf-8");
			System.out.println("len: " + strs.length);
			System.out.println("hex: " + bu.convertBinaryToHex(strs));
			System.out.println("val: " + new String(strs, "utf-8"));
			System.out.println();
			
			strs = name.getBytes();
			System.out.println("len: " + strs.length);
			System.out.println("hex: " + bu.convertBinaryToHex(strs));
			System.out.println("val: " + name);
			System.out.println();
			
			String conv = new String(name.getBytes("utf-8"), "euc-kr");
			System.out.println("con: " + conv);
			strs = conv.getBytes();
			System.out.println("len: " + strs.length);
			System.out.println("hex: " + bu.convertBinaryToHex(strs));
			
			strs = conv.getBytes("euc-kr");
			System.out.println("len: " + strs.length);
			System.out.println("hex: " + bu.convertBinaryToHex(strs));
			System.out.println();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

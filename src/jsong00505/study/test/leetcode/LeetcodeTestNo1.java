package jsong00505.study.test.leetcode;

import static org.junit.Assert.*;
import jsong00505.study.leetcode.no1.FindMedianSortedArrays;
import jsong00505.study.leetcode.no1.LongestPalindrome;
import jsong00505.study.leetcode.no1.PalindromeNumber;
import jsong00505.study.leetcode.no1.ReverseInteger;
import jsong00505.study.leetcode.no1.RomanToInt;
import jsong00505.study.leetcode.no1.StringToInteger;
import jsong00505.study.leetcode.no1.ZigZagConversion;

import jsong00505.study.leetcode.no1.*;

import org.junit.Test;

public class LeetcodeTestNo1 {
	//@Test
	public void longestPalindromeTest() {
		String str = "aabb";
		System.out.println(":::LONGEST PALINDROME TEST:::");
		System.out.println(LongestPalindrome.longestPalindrome(str));
	}
	
	//@Test
	public void findMedianSortedArraysTest() {
		int[] x = { 1, 2};
		int[] y = { 3, 4};
		
		System.out.println(":::FIND MEDIAN SORTED ARRAYS TEST:::");
		System.out.println(FindMedianSortedArrays.findMedianSortedArrays(x, y));
	}
	
	//@Test
	public void romanToIntTest() {
		String romanStr = "MLCVII";
		String romanStr2 = "MCMXCVI";
		
		System.out.println(":::ROMAN TO INT TEST:::");
		// RESULT: 1157
		System.out.println(RomanToInt.romanToInt(romanStr));
		// RESULT: 1996
		System.out.println(RomanToInt.romanToInt(romanStr2));
	}
	

	//@Test
	public void zigZagConversionTest() {
	    System.out.println(":::ZIGZAG COVERSION TEST:::");
	    String str = "PAYPALIWHISHER";
	    int rowNums = 3;
	    System.out.println("MY CASE: " + ZigZagConversion.convert(str, rowNums));
	    // PAHEAPLWIHRYIS
	    
	    String case1 = "A";
	    System.out.println("CASE1: " + ZigZagConversion.convert(case1, 1));
	    //result: A
	    
	    String case2 = "AB";
        System.out.println("CASE2: " + ZigZagConversion.convert(case2, 1));
        //result: AB
        
        String case3 = "ABCD";
        System.out.println("CASE3: " + ZigZagConversion.convert(case3, 4));
        //result: ABCD
	}
	
	//@Test
	public void reverseIntegerTest() {
		System.out.println(":::REVERSE INTEGER TEST:::");
		
		int case1 = 123;
		int case2 = -123;
		int case3 = 1534236469;
		
		System.out.println("CASE1: " + ReverseInteger.reverse(case1));
		System.out.println("CASE2: " + ReverseInteger.reverse(case2));
		System.out.println("CASE3: " + ReverseInteger.reverse(case3));
		
	}
	
	@Test
	public void stringToIntegerTest() {
		System.out.println(":::STRING TO INTEGER TEST:::");
		
		String case1 = "100";			// 100
		String case2 = "-100";			// -100
		String case3 = "NOINT";			// 0
		String case4 = "    010";		// 10
		String case5 = "  -0012a42";	// -12
		String case6 = "aa12";			// 0
		String case7 = "   0 123";      // 0
		String case8 = "2147483648";	// 2147483647
		String case9 = "+2147483648";	// 2147483647
		String case10 = "-2147483649";	// -2147483648
		String case11 = "123   456";	// 123
		String case12 = "";
		String case13 = "  123   456";  // 123
	    String case14 = "   +0 123";    // 0
	    String case15 = "-2147483649aaaa"; // -2147483648
	    String case16 = "+-2";			// 0
	    String case17 = "  +  413";			// 0
	    String case18 = "       11504069574n"; // 2147483647
	    String case19 = "   -115579378e25"; // -115579378
		

		assertEquals(100, StringToInteger.myAtoi(case1), 0);
		assertEquals(-100, StringToInteger.myAtoi(case2), 0);
		assertEquals(0, StringToInteger.myAtoi(case3), 0);
		assertEquals(10, StringToInteger.myAtoi(case4), 0);
		assertEquals(-12, StringToInteger.myAtoi(case5), 0);
		assertEquals(0, StringToInteger.myAtoi(case6), 0);
		assertEquals(0, StringToInteger.myAtoi(case7), 0);
		assertEquals(2147483647, StringToInteger.myAtoi(case8), 0);
		assertEquals(2147483647, StringToInteger.myAtoi(case9), 0);
		assertEquals(-2147483648, StringToInteger.myAtoi(case10), 0);
		assertEquals(123, StringToInteger.myAtoi(case11), 0);
		assertEquals(0, StringToInteger.myAtoi(case12), 0);
		assertEquals(123, StringToInteger.myAtoi(case13), 0);
		assertEquals(0, StringToInteger.myAtoi(case14), 0);
		assertEquals(-2147483648, StringToInteger.myAtoi(case15), 0);
		assertEquals(0, StringToInteger.myAtoi(case16), 0);
		assertEquals(0, StringToInteger.myAtoi(case17), 0);
		assertEquals(2147483647, StringToInteger.myAtoi(case18), 0);
		assertEquals(-115579378, StringToInteger.myAtoi(case19), 0);


	}
	
	//@Test
	public void palilndromeNumberTest() {
		int case1 = -1000;
		int case2 = 0;
		int case3 = 111211;
		int case4 = -11211;
		int case5 = 1001;
		

		assertFalse(PalindromeNumber.isPalindrome(case1));
		assertTrue(PalindromeNumber.isPalindrome(case2));
		assertFalse(PalindromeNumber.isPalindrome(case3));
		assertFalse(PalindromeNumber.isPalindrome(case4));
		assertTrue(PalindromeNumber.isPalindrome(case5));
	}
}

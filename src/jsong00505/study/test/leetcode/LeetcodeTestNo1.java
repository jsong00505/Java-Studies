package jsong00505.study.test.leetcode;

import jsong00505.study.leetcode.no1.FindMedianSortedArrays;
import jsong00505.study.leetcode.no1.LongestPalindrome;
import jsong00505.study.leetcode.no1.ReverseInteger;
import jsong00505.study.leetcode.no1.RomanToInt;
import jsong00505.study.leetcode.no1.StringToInteger;
import jsong00505.study.leetcode.no1.ZigZagConversion;

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
		String case7 = "   +0 123";		// 123
		String case8 = "2147483648";	// 2147483647
		String case9 = "-2147483649";	// -2147483648
		
		System.out.println("CASE1: " + StringToInteger.myAtoi(case1));
		System.out.println("CASE2: " + StringToInteger.myAtoi(case2));
		System.out.println("CASE3: " + StringToInteger.myAtoi(case3));
		System.out.println("CASE4: " + StringToInteger.myAtoi(case4));
		System.out.println("CASE5: " + StringToInteger.myAtoi(case5));
		System.out.println("CASE6: " + StringToInteger.myAtoi(case6));
		System.out.println("CASE7: " + StringToInteger.myAtoi(case7));
		System.out.println("CASE8: " + StringToInteger.myAtoi(case8));
		System.out.println("CASE9: " + StringToInteger.myAtoi(case9));
	}
}

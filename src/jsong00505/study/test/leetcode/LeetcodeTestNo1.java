package jsong00505.study.test.leetcode;

import jsong00505.study.leetcode.no1.FindMedianSortedArrays;
import jsong00505.study.leetcode.no1.LongestPalindrome;
import jsong00505.study.leetcode.no1.RomanToInt;
import jsong00505.study.leetcode.no1.ZigZagConversion;

import org.junit.Test;

public class LeetcodeTestNo1 {
	@Test
	public void longestPalindromeTest() {
		String str = "aabb";
		System.out.println(":::LONGEST PALINDROME TEST:::");
		System.out.println(LongestPalindrome.longestPalindrome(str));
	}
	
	@Test
	public void findMedianSortedArraysTest() {
		int[] x = { 1, 2};
		int[] y = { 3, 4};
		
		System.out.println(":::FIND MEDIAN SORTED ARRAYS TEST:::");
		System.out.println(FindMedianSortedArrays.findMedianSortedArrays(x, y));
	}
	
	@Test
	public void romanToIntTest() {
		String romanStr = "MLCVII";
		String romanStr2 = "MCMXCVI";
		
		System.out.println(":::ROMAN TO INT TEST:::");
		// RESULT: 1157
		System.out.println(RomanToInt.romanToInt(romanStr));
		// RESULT: 1996
		System.out.println(RomanToInt.romanToInt(romanStr2));
	}
	

	@Test
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
}

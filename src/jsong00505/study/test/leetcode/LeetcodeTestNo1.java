package jsong00505.study.test.leetcode;

import jsong00505.study.leetcode.no1.FindMedianSortedArrays;
import jsong00505.study.leetcode.no1.LongestPalindrome;
import jsong00505.study.leetcode.no1.RomanToInt;

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
}

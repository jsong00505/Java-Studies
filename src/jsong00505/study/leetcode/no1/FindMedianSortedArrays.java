package jsong00505.study.leetcode.no1;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

import jsong00505.core.utils.ArrayUtils;

public class FindMedianSortedArrays {
	/*
	 * count in disorder for preventing index out of bounds.
	 * 
	 * FAILED: TIME LIMIT EXCEEDED
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		boolean isOdd = true;
		double result=0;
		int middle = 0;
		
		ArrayUtils au = new ArrayUtils();
		int[] concatNums = au.concatenate(nums1, nums2);
		
		Arrays.sort(concatNums);
		
		if(concatNums.length == 1) {
		    result = concatNums[0];
		}else if(concatNums.length % 2 == 0) {
		    // EVEN
		    middle = concatNums.length / 2;
		    result = (concatNums[middle] + concatNums[middle-1]) / 2.0;
		} else {
		    // ODD
		    middle = concatNums.length /2;
		    result = concatNums[middle];
		}
		return result;
	}
	

}
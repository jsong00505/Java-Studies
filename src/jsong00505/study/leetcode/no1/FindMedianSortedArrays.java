package jsong00505.study.leetcode.no1;

import java.util.Arrays;
import java.util.HashMap;

import jsong00505.core.utils.ArrayUtils;

public class FindMedianSortedArrays {
    /*
     * 
     * Strategy
     * 1. Remove concatenation.
     * 2. Just go throw the front of arrays
     * 3. Check if the full length is odd
     * 
     * My runtime beats 84.43% of java submissions.
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean isOdd = true;
        double result=0;
        int middle = 0;
        
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int fullLen = nums1Len + nums2Len;
        
        int nums1Cnt = 0;
        int nums2Cnt = 0;
        
        boolean nums1Cut = false;
        boolean nums2Cut = false;
        
        HashMap<Integer, Integer> hm = new HashMap<> ();
        
        if(fullLen % 2 == 0) {
            isOdd = false;
        }
        
        middle = fullLen / 2;
        
        if(fullLen != 1){
            for(int i =0; i <= middle; i++) {
                if(nums1Cnt == nums1Len) {
                    hm.put(i, nums2[nums2Cnt]);
                    nums2Cnt++;
                }else if(nums2Cnt == nums2Len) {
                    hm.put(i, nums1[nums1Cnt]);
                    nums1Cnt++;
                }else if(nums1[nums1Cnt] > nums2[nums2Cnt]) {
                    hm.put(i, nums2[nums2Cnt]);
                    nums2Cnt++;
                } else {
                    hm.put(i, nums1[nums1Cnt]);
                    nums1Cnt++;
                }
            }
        }
        
        if(fullLen == 1) {
            if(nums1Len > nums2Len) {
                result = nums1[0];
            } else {
                result = nums2[0];
            }
        } else if(isOdd) {
            result = hm.get(middle);
        } else {
            result = (hm.get(middle) + hm.get(middle-1)) / 2.0;
        }
        return result;
    }
	/*
	 * count in disorder for preventing index out of bounds.
	 * 
	 * FAILED: TIME LIMIT EXCEEDED
	 */
	public static double findMedianSortedArraysFailed(int[] nums1, int[] nums2) {
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
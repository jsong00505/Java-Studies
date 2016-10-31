package jsong00505.study.leetcode.no1;

public class FindMedianSortedArrays {
	/*
	 * count in disorder for preventing index out of bounds.
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		boolean isOdd = true;

		int totalLength = nums1.length + nums2.length;
		double result = 0;
		if(totalLength % 2 == 0) {
			isOdd = false;
		}
		int middle = totalLength / 2;
		
		if(!isOdd) {
			middle++;
		}
		
		int xPos = nums1.length-1, yPos = nums2.length-1;
		
		System.out.println("middle: " + middle);
		
		for(int i=0;i<middle-1;i++) {
			if(xPos < 0) {
				yPos--;
			} else if(yPos < 0) {
				xPos--;
			}else if(nums1[xPos] < nums2[yPos]){
				xPos--;
			} else{
				yPos--;
			}
		}

		if(xPos < 0) {
			result = nums2[--yPos];
		} else if(yPos < 0) {
			result = nums1[--xPos];
		} else if(nums1[xPos] < nums2[yPos]){
			result = nums1[--xPos];
		} else{
			result = nums2[--yPos];
		}
		if(!isOdd) {
			if(nums1[xPos] < nums2[yPos]){
				result = (nums1[++xPos]+ result) / 2.0;
			} else{
				result = (nums2[++yPos]+ result) / 2.0;
			}
		}
		
		System.out.println(result);
		return result;
	}
}
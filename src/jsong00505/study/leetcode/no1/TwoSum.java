package jsong00505.study.leetcode.no1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4};
		int target = 6;
		
		twoSum(nums, target);
		twoSumSolution1(nums, target);
		twoSumSolution2(nums, target);
		twoSumSolution3(nums, target);
		
	}
	
	
	//The runtime beats 21.4%
    public static int[] twoSum(int[] nums, int target) {
    	int sum = 0;
    	
        for(int i = 0;i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		sum = nums[i] + nums[j];
        		if(sum == target) {
        			System.out.printf("twoSum: %d, %d\n", i, j);
        			return new int[] {i, j};
        		}
        	}
        }
        
        return new int[] {0, 0};
    }
    
    /* 
     * Brute Force
     * It is same as I approached. That is because very simple thought to implement
     * The solution code is pretty simpler than mine.
     */
    public static int[] twoSumSolution1(int[] nums, int target) {
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[j] == target - nums[i]) {
    				return new int[] {i, j};
    			}
    		}
    	}
    	return new int[] {0, 0};
    	// or throw new IllegalArgumentException("No two sum solution");
    }
    
    /*
     * Two-pass Hash Table
     * The runtime beats 43.84%
     * Faster 2 times than mine.
     */
    public static int[] twoSumSolution2(int[] nums, int target) {
    	Map<Integer, Integer> numsMap = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		numsMap.put(nums[i], i);
    	}
    	
    	for(int i=0;i<nums.length;i++) {
    		int complement = target - nums[i];
    		if(numsMap.containsKey(complement) && numsMap.get(complement) != i) {
    			System.out.printf("twoSum: %d, %d\n", i, numsMap.get(complement));
    			return new int[] {i, numsMap.get(complement)};
    		}
    	}    	
    	
    	throw new IllegalArgumentException("No two sum solution");
    }
    
    /*
     * Two-pass Hash Table
     * The runtime beats 48.62%
     * Faster 2 times than mine, but not much faster than Two-pass hash Table.
     */
    public static int[] twoSumSolution3(int[] nums, int target) {
    	Map<Integer, Integer> numsMap = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		int complement = target - nums[i];
    		if(numsMap.containsKey(complement)) {
    			System.out.printf("twoSum: %d, %d\n", i, numsMap.get(complement));
    			return new int[] {i, numsMap.get(complement)};
    		}
    		numsMap.put(nums[i], i);
    	}
    	throw new IllegalArgumentException("No two sum solution");
    }
    
}

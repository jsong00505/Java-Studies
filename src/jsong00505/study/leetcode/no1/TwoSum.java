package jsong00505.study.leetcode.no1;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4};
		int target = 6;
		
		int[] result = twoSum(nums, target);
		System.out.println("result: "+result[0]+","+result[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	int sum = 0;
    	
        for(int i = 0;i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		sum = nums[i] + nums[j];
        		System.out.println("sum: " + sum);
        		if(sum == target) {
        			int[] result = {i, j};
        			return result;
        		}
        	}
        }
        int[] result = {0, 0};
        return result;
    }
}

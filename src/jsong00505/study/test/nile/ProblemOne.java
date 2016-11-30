package jsong00505.study.test.nile;

import java.util.Arrays;

public class ProblemOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,1};
		int [] arr2 = {-1, 3, -4, 5, 1, -6, 2, 1};
		int [] arr3 = {-1, -1, -1};
		int [] arr4 = {};
		int result = solution(arr);
		
		System.out.println("RESULT: " + solution(arr4));

	}
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
        
        // get length of the array
        int length = A.length;
        System.out.println("length: " + length);
        
        Integer[] right_arr = new Integer[length];
        Integer[] left_arr = new Integer[length];
        int right_sum = 0;
        int left_sum = 0;
        for(int i=0;i<length;i++) {
            if(i == 0) {
                left_sum = 0;
                
                right_sum = Arrays.stream(Arrays.copyOfRange(A,1,A.length)).sum();
            } else if(i == length-1){
                left_sum = Arrays.stream(Arrays.copyOfRange(A,0,A.length-1)).sum();
                
                right_sum = 0;
            }else {
                left_sum = Arrays.stream(Arrays.copyOfRange(A, 0, i)).sum();
                right_sum = Arrays.stream(Arrays.copyOfRange(A, i+1, A.length)).sum();

            }
                            System.out.println("lefty: " + left_sum + ", righty: " + right_sum);
            if(left_sum == right_sum) {
                return i;   
            }
            else {
                left_sum = 0;
                right_sum = 0;
            }
        }
        
        return -1;
    }
}

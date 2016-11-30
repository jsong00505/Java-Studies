package jsong00505.study.test.nile;


public class ProblemThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2};
		int [] arr2 = {30,20, 30};
		int [] arr3 = {2,2,2,2,1,2,-1,2,1,3};
		
		System.out.println("RESULT: " + solution(arr2));
	}
	
	public static int solution(int[] A) {
		int prevPos = 0;
		int currPos = 0;
		int nextPos = 1;
		int curSize = 1;
        int maxSize = 1;
        int beginPos = 0;
        int maxPos = 0;
        
        for(int i=1;i<A.length;i++) {
            if(A[currPos] < A[nextPos]) {
            	curSize++;
            } else {
            	curSize = 1;
            	beginPos = nextPos;
            }
            
            if(curSize > maxSize) {
            	curSize = maxSize;
            	maxPos = beginPos;
            }
            
            currPos++;
            nextPos++;
            
        }
		return maxPos;

			
	}
}

package jsong00505.study.test.nile;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class ProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {4, 2, 2, 3, 2, 4, 2, 2, 6, 4};
		int [] arr2 = {1, 1, 1, 50, 1};
		int [] arr3 = {1};
		
		System.out.println("RESULT: " + solution(arr3));
	}
	
	public static int solution(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		if(A.length < 1) {
			return -1;
		}
		
		for(int i =0;i<A.length;i++) {
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			} else {
				hm.put(A[i], 1);
			}
		}
		
		int maxValue = Collections.max(hm.values());
		
		if(maxValue > A.length / 2) {
			for(Entry<Integer, Integer> entry: hm.entrySet()) {
				if(entry.getValue() == maxValue) {
					return entry.getKey();
				}
			}
		} 
		return -1;

			
	}
	

}

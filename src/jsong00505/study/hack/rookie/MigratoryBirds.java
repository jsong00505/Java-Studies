package jsong00505.study.hack.rookie;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, Integer> birdsMap = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int birdId = sc.nextInt();
			
			if(birdsMap.containsKey(birdId)) {
				birdsMap.put(birdId, birdsMap.get(birdId)+1);
			} else {
				birdsMap.put(birdId, 1);
			}
		}
		
		int commonId = 0;
		int countCommon = 0;
		for(int id: birdsMap.keySet()) {
			if(birdsMap.get(id) > countCommon) {
				countCommon = birdsMap.get(id);
				commonId = id;
			} else if(birdsMap.get(id) == countCommon && commonId > id) {
				commonId = id;
			}
		}
		
		System.out.println(commonId);
	}
}

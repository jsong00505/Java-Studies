package jsong00505.study.hack30days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28RegExPatternsAndIntroToDB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<String> reqList = new ArrayList<>();
		for(int i = 0; i < N; i ++) {
			String name = sc.next();
			String email = sc.next();
			
			if(email.indexOf("gmail.com") > -1) {
				reqList.add(name);
			}
		}
		
		
		Collections.sort(reqList);
		
		for(String res: reqList) {
			System.out.println(res);
		}
		
	}
	

}

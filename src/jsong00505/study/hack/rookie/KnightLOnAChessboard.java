package jsong00505.study.hack.rookie;

import java.util.HashMap;
import java.util.Scanner;

public class KnightLOnAChessboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// count (1,1) ~ (n-1, n-1), so that would be from 2 to (n - 1) *2
		int goal = (n - 1 ) * 2;
		HashMap<Point, Integer> result = new HashMap<>();
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(goal % (i+j) == 0) {
					result.put(new Point(i, j), goal / (i+j));
				} else {
					result.put(new Point(i, j), -1);
				}
			}
			
		}
		System.out.println("goal : " + goal);
		for(Point p: result.keySet()) {
			System.out.println("("+ p.x + ","+ p.y +")" + result.get(p));
		}
		/*for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				System.out.print(result.get(Point(i, j)) + " ");
				
			}
			System.out.print("\n");
		}*/
	}
	
	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}



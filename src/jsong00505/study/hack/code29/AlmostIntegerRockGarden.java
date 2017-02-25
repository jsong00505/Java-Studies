package jsong00505.study.hack.code29;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jsong on 25/02/2017.
 */
public class AlmostIntegerRockGarden {

	// need to use DFS algorithm
	// so have to make tree
	// good good
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		int min = -12;
		int max = 12;

		int firstX = sc.nextInt();
		int firstY = sc.nextInt();

		HashMap<Point, Double> euclideanDistanceMap = new HashMap<>();

		for(int i = min; i <= max; i++) {
			for (int j = min; j <= max; j++) {
				if (getEuclideanDistance(j, i) != Math.floor(getEuclideanDistance(j, i))) {

					double temp = (getEuclideanDistance(j, i) - Math.floor(getEuclideanDistance(j, i))) * Math.pow(10, 12);
					euclideanDistanceMap.put(new Point(j, i), temp);
				}

			}
		}

		for(Point p: euclideanDistanceMap.keySet()) {
			System.out.println(euclideanDistanceMap.get(p));
		}
		sc.close();
	}

	public static double getEuclideanDistance(int x, int y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

	}

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public String toString() {
			return x + "," + y;
		}

	}
}

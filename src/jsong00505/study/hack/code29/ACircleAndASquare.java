package jsong00505.study.hack.code29;

import java.util.Scanner;

/**
 * Created by jsong on 22/02/2017.
 */
public class ACircleAndASquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int circleX = in.nextInt();
		int circleY = in.nextInt();
		int r = in.nextInt();
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		// your code goes here

		char[][] canvas = new char[h][w];

		// init 2D array
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				canvas[i][j] = '.';
			}
		}

		// draw circle first
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if (isInCircleBoundary(r, j, i, circleX, circleY)) {
					canvas[i][j] = '#';
				}
			}
		}

		// draw square
		int a = getA(x1, y1, x3, y3);
		int c = getC(x1, y1, x3, y3);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if (isInSquareBoundary(j, i, a, c, x1, y1, x3, y3)) {
					canvas[i][j] = '#';
				}
			}
		}

		// print canvas
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
	}

	public static boolean isInCircleBoundary(int r, int xPos, int yPos, int circleX, int circleY) {
		// r^2 = (x-a)^2 + (y-b)^2
		double squareValue = (Math.pow((xPos - circleX), 2) + Math.pow((yPos - circleY), 2));

		if(squareValue <= (r * r)) {
			return true;
		}

		return false;
	}

	public static boolean isInSquareBoundary(int xPos, int yPos, int a, int c, int x1, int y1, int x3, int y3) {

		double d = Math.abs(a * xPos + yPos + c) / Math.sqrt(a * a + 1);

		if(isSmallerThanSin45(getDistance(x1, y1, xPos, yPos) ,d)
				&& isSmallerThanSin45(getDistance(x3, y3, xPos, yPos) ,d)
				&& xPos >= (x1 - 1) && xPos <= (x3 - 1)) {
			return true;
		}
		return false;
	}

	public static int getA(int x1, int y1, int x3, int y3) {
		return (y3 - y1) / (x3 - x1);
	}

	public static int getC(int x1, int y1, int x3, int y3) {
		return (x3 * y1 - x1 * y3) / (x3 - x1);
	}

	public static double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static boolean isSmallerThanSin45(double d1, double d2) {
		if(d1 / d2 <= Math.sqrt(2) /(double) 2) {
			return true;
		}
		return false;
	}
}

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
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if (test(j, i, x1, y1, x3, y3)) {
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

	public static boolean isInSquareBoundary(int xPos, int yPos, int x1, int y1, int x3, int y3) {
		System.out.println(xPos + "," + yPos);
		// y = mx + b
		// mx -y + b = 0
		double slopeM = 0;
		if((y3 - y1) != 0) {
			slopeM = (x3 - x1) / (double) (y3 - y1);
		}
		
		double valueOfB = y3 - slopeM * x3;
		
		// abs(ax + by + c) / sqrt(a^2 + b^2)
		double d = Math.abs(slopeM * xPos - yPos + valueOfB) / Math.sqrt(slopeM * slopeM + 1);

		if(isSmallerThanSin45(getDistance(x1, y1, xPos, yPos) ,d)
				&& isSmallerThanSin45(getDistance(x3, y3, xPos, yPos) ,d)) {
			return true;
		}
		return false;
	}

	public static double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static boolean isSmallerThanSin45(double d1, double d2) {
		System.out.println(d1 + "," + d2);
		System.out.println();
		System.out.println((Math.sqrt(2) /(double) 2));
		if((d2 / d1) <= Math.sin(Math.toRadians(45)) 
				&& d1 != 0 && d2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean test(int cx, int cy, int x1, int y1, int x2, int y2) {
		//angle = atan2(y1x2-x1y2, x1x2+y1y2)
		// atan((y2-cy) / (x2 -cx)) - atan((y1-cy) / (x1-cx))
		if((Math.atan((y2-cy)/(x2-cx) - Math.atan((y1-cy)/(x1-cx))) <= Math.toRadians(45))
				&& x2 - cx != 0 && x1 - cx != 0)  {
			return true;
		}
		
		
		return false;
	}
	
}

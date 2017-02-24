package jsong00505.study.hack.code29;

import java.util.Scanner;

/**
 * Created by jsong on 22/02/2017.
 */
public class ACircleAndASquare {
	
/*	....................
	.........#..........
	......#######.......
	.....#########......
	.....#########......
	.....#########......
	....###########.....
	.....#########......
	.....#########......
	.....#########......
	......#######.......
	.........#.###......
	..........#####.....
	.........#######....
	........#########...
	.........#######.... */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
/*		int w = in.nextInt();
		int h = in.nextInt();
		int circleX = in.nextInt();
		int circleY = in.nextInt();
		int r = in.nextInt();
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();*/
		
/*		20 16
		9 6 5
		16 14 8 14*/
		int w = 20;
		int h = 16;
		int circleX = 9;
		int circleY = 6;
		int r = 5;
		int x1 = 16;
		int y1 = 14;
		int x3 = 8;
		int y3 = 10;
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
					//canvas[i][j] = '#';
				}
			}
		}		
		
		double squareX = Math.abs(x3 + x1) / 2;
		double squareY = Math.abs(y3 + y1) / 2;
		double squareR = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)) / 2;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if (isInCircleBoundary(squareR, j, i, squareX, squareY)) {
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
	
	public static boolean isInCircleBoundary(double r, int xPos, int yPos, double circleX, double circleY) {
		// r^2 = (x-a)^2 + (y-b)^2
		double squareValue = (Math.pow((xPos - circleX), 2) + Math.pow((yPos - circleY), 2));

		if(squareValue <= (r * r)) {
			return true;
		}

		return false;
	}
	
	
}

package jsong00505.study.hack.java.intro;

import java.util.Scanner;

/**
 * Created by jsong on 25/02/2017.
 */
public class JavaStaticInitializerBlock {

	public static int B;
	public static int H;
	public static boolean flag;

	static  {
		Scanner sc = new Scanner(System.in);

		int B = sc.nextInt();
		int H = sc.nextInt();

		boolean flag = B < 1 || H < 1? false : true;

		if(!flag) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args){
		if(flag){
			int area=B * H;
			System.out.print(area);
		}

	}//end of main
}

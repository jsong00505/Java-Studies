package jsong00505.study.hack.java.intro;

import java.util.Scanner;

/**
 * Created by jsong on 23/02/2017.
 */
public class JavaDatatypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0;i<t;i++)
		{
			boolean fitFlag = false;
			try
			{
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x >= -128 && x <= 127) {
					System.out.println("* byte");
					fitFlag = true;
				}

				if(x >= (-1 * Math.pow(2, 15)) && x <= (Math.pow(2, 15) - 1)) {
					System.out.println("* short");
					fitFlag = true;
				}

				if(x >= (-1 * Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) {
					System.out.println("* int");
					fitFlag = true;
				}

				if(x >= (-1 * Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) {
					System.out.println("* long");
					fitFlag = true;
				}

				if(!fitFlag) {
					throw new Exception();
				}
				//Complete the code
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}

		}
	}
}

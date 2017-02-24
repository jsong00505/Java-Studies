package jsong00505.study.hack.java.intro;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	// declare Scanner class
    	Scanner sc = new Scanner(System.in);
    	
    	int count = 1;
    	while(sc.hasNext()) {
    		System.out.println((count++) + " " + sc.nextLine());
    	}
    	// have to close Scanner class
    	sc.close();
    }
}

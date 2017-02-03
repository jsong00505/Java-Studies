package jsong00505.study.hack30days;

import java.util.Scanner;

public class Day16ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        	int i = Integer.parseInt(S);
        	System.out.println(i);
        } catch(Exception e) {
        	System.out.println("Bad String");
        }
    }
}

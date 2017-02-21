package jsong00505.study.hack.java.intro;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            int lenS1 = s1.length();
            System.out.print(s1);
            for(int j = 0; j < 15 - lenS1; j++ ) {
            	System.out.print(" ");
            }
            
            String strX = x < 10? "00" + x : (x < 100? "0" + x : Integer.toString(x));
            System.out.println(strX);
        }
        System.out.println("================================");
    }

}

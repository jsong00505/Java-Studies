package jsong00505.study.leetcode.no1;

/**
 * Created by jsong on 10/29/16.
 */
public class LongestPalindrome {
    /*
     * Palindrome is a word, phrase, or sequence that reads the same backward as forward
     * ex) madam, nurses run
     *
     * sol1: double for loop - the simplest way to solve
     * sol2: using regular expression - just my opinion I don't know how to imple yet...
     */
    public static String longestPalindrome(String s) {
        int strLen = s.length();

        for(int i = 0; i<strLen; i=i+2) {
            String rev = reverseString(s.substring(i,i));
        }
        reverseString(s);
        return s;
    }

    /*
     * Reference: http://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html
     * 5 Ways To Reverse A String In Java With Example
     *
     * @ arg      : src
     * @ return   : dest
     */
    public static String reverseString(String src) {
        StringBuilder sb = new StringBuilder();
        String dest;
        
        sb.append(src);
        dest = sb.reverse().toString();

        return dest;
        
    }
}

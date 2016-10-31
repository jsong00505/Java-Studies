package jsong00505.study.leetcode.no1;

/**
 * Created by jsong on 10/29/16.
 */
public class LongestPalindrome {
    /*
     * Palindrome is a word, phrase, or sequence that reads the same backward as forward
     * ex) madam, nurses run
     *
     * sol1: double for loop - the simplest way to solve - referenced by failed #2 TIME LIMIT EXCEEDED
     * sol2: using regular expression - just my opinion, and I don't know how to implement yet...
     * 
     * failed
     * 1. I just checked odd numbers of string's length -> need to add to check even one by 16.10.31
     * 2. TIME LIMIT EXCEEDED -> "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy"
     * -> I need another solution for that...
     */
    public static String longestPalindrome(String s) {
        int strLen = s.length();
        String preStr = "";
        String postStr = "";
        String longestStr = "";
        int middle = 0; 
        // check 
        for(int i = 0; i<strLen; i++) {
        	if(i == 0) {
        		longestStr = s.substring(0, 1);
    			continue;
    		}
        	for(int j = 0; j<strLen-i;j++) {
        		/*
        		if((j+i+1) == s.length()) {
            		System.out.println("str: " + s.substring(j));
        		}else {
            		System.out.println("str: " + s.substring(j, j+i+1));
        		} */


        		// get middle index of string
        		middle = ((j+i) + j) / 2;
        		if(i % 2 != 0) {
        			//EVEN
        			preStr = s.substring(j,middle+1);
        		} else {
        			//ODD
            		preStr = s.substring(j,middle);
        		}

        		//System.out.println("i: " + i + ", j: " + j+ ", m: " + middle);
        		if((j+i+1) == s.length()) {
        			postStr = s.substring(middle+1);
        		}else {
        			postStr = s.substring(middle+1, j+i+1);
        		}
        		
        		//System.out.println("postStr: " + postStr);
        		postStr = reverseString(postStr);
        		//System.out.println("PRE: " + preStr + ", POST: " + postStr);
        		if(preStr.equals(postStr)) {
        			longestStr = s.substring(j, j+i+1);
        			break;
        		}
        	}
        	 //System.out.println(">> DONE");
        }
        //System.out.println(">> longest: " + longestStr);
        return longestStr;
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
        //System.out.println("dest: " + dest + ", sb.reverse: " + sb.reverse() + ", src: " + src);
        return dest;
        
    }
}

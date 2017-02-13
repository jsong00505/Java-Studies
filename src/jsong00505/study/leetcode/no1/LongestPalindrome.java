package jsong00505.study.leetcode.no1;

import java.util.HashMap;


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
     * 
     * Strategy
     * 1.
     */
    
    public static String longestPalindrome(String s) {
        int strLen = s.length();
        int[][] pArr = new int[strLen][strLen];
        
        /*
         *  init array
         *  | 1 0
         *  | 0 1
         */
        
        for(int i = 0; i < strLen; i++) {
        	pArr[i][i] = 1;
        }
        
        /*
         * check second value
         * | 1 1
         * | 0 1
         */
        
        for(int i = 0; i < strLen - 1; i++) {
        	if(s.charAt(i) == s.charAt(i + 1)) {
        		pArr[i][i + 1] = 1;
        	} else {
        		pArr[i][i + 1] = 0;
        	}
        }
        
        for(int i = 2; i < strLen; i++) {
        	for(int j = i; j < strLen; j++) {
        		if(pArr[j - i + 1][j - 1] == 1 && s.charAt(j - i) == s.charAt(j)) {
        			pArr[j - i][j] = 1;
        		}
        			
        	}
        }
        
        int maxLength = 0;
        int len = 0;
        String temp = "";
        for(int i = 0; i < strLen; i++) {
        	for(int j = 0; j < strLen; j++) {
        		System.out.print(pArr[i][j] + "\t");
        		if(pArr[i][j] == 1 && s.substring(i, j+1).length() > maxLength) {
        			temp = s.substring(i, j+1);
        			maxLength = s.substring(i, j+1).length();
        		}
        	}
        	System.out.print("\n");
        }
        return temp;
    }
    /**find the longest palindromic substring*/
    public static String longestPalindromeSol2(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chs = s.toCharArray();
        int[] result = new int[2];
        int position=0;

        while (chs.length-position>(result[1]-result[0])/2){
            int tmp=position+1;
            if (tmp==chs.length)
                break;
            while (chs[position]==chs[tmp]){
                tmp++;
                if (tmp==chs.length)
                    break;
            }

            int[] tmptag=findThelongest(position-1,tmp,chs);
            
            if (tmptag[1]-tmptag[0]>result[1]-result[0])
                result=tmptag;
            
            position=tmp;
        }
        StringBuilder bd=new StringBuilder();
        for(int i=result[0];i<=result[1];i++){
            bd.append(chs[i]);
        }
        return bd.toString();
    }

    private static int[] findThelongest(int left, int right, char[] chs) {
        int[] r=new int[2];
        while (left>=0&&right<chs.length){
            if (chs[left]!=chs[right]){
                break;
            }
            left--;
            right++;
        }
        r[0]=left+1;
        r[1]=right-1;
        
        return r;
    }
    
    
    public static String longestPalindromeSol1(String s) {
        
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        
        int max = 1;
        int start = 0, end = 0;
        
        for(int i = 0; i < n; i++)
        {
            dp[i][i] = true;
        }
        
        for(int i = 0; i < n - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i + 1))
            {
                dp[i][i + 1] = true;
                max = 2;
                start = i;
                end = i + 1;
            }
            else
            {
                dp[i][i + 1] = false;
            }
        }
        
        for(int k = 3; k <= n; k++)
        {
            for(int i = 0; i < n - k + 1; i++)
            {
                int j = i + k - 1;
                
                System.out.println("dp["+(i + 1)+"]["+(j - 1)+"] => " + dp[i + 1][j - 1]);
                System.out.println("s.charAt("+i+") == s.charAt("+j+") => "+(s.charAt(i) == s.charAt(j)));
                
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                System.out.println("[RESULT]dp["+i+"]["+j+"] => "+ dp[i][j]);
                
                if(dp[i][j])
                {
                    if(k > max)
                    {
                        max = k;
                        start = i;
                        end = j;
                    }
                }
                
            }
        }
        
        for(int i=0; i< n; i++) {
            for(int j=0;j<n;j++) {
                System.out.printf(dp[i][j] + "\t");
            }
            System.out.println("");
        }
        return s.substring(start, end + 1);
        
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

package jsong00505.study.leetcode.no1;

public class ReverseInteger {
	
	/*
	 * Reverse digits of an integer.
	 * 
	 * Example1: x = 123, return 321
	 * 
	 * Example2: x = -123, return -321
	 * 
	 * Mine beats 30.25% of java submissions.
	 * 
	 * - Check this.
	 *  If the reversed is out of number format, the return should be 0.
	 *  Don't let the exception occur.
	 * 
	 */
	public static int reverse(int x) {
		int result = x;
		String resultStr = "";
		boolean negFlag = false;
		if(x < 0) {
			negFlag = true;
		}
		resultStr = reverseString(Integer.toString(Math.abs(x)));
		
		if(negFlag) {
			resultStr = "-"+resultStr;
		}
		try {
			result = Integer.parseInt(resultStr);
		}catch(NumberFormatException nfe) {
			result = 0;
		}
		
		return result;
	}
	
    public static String reverseString(String src) {
        StringBuilder sb = new StringBuilder();
        String dest;
        
        sb.append(src);
        dest = sb.reverse().toString();
        
        return dest;
        
    }
}

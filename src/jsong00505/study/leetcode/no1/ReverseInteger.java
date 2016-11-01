package jsong00505.study.leetcode.no1;

public class ReverseInteger {
	public static int reverse(int x) {
		int result = x;
		boolean negFlag = false;
		if(x < 0) {
			negFlag = true;
		}
		result = Math.abs(result);

		return result;
	}
	
    public static String reverseString(String src) {
        StringBuilder sb = new StringBuilder();
        String dest;
        
        sb.append(src);
        dest = sb.reverse().toString();
        //System.out.println("dest: " + dest + ", sb.reverse: " + sb.reverse() + ", src: " + src);
        return dest;
        
    }
}

package jsong00505.core.utils;

public class ReverseString {
    public static String reverseString(String src) {
        StringBuilder sb = new StringBuilder();
        String dest;
        
        sb.append(src);
        dest = sb.reverse().toString();
        //System.out.println("dest: " + dest + ", sb.reverse: " + sb.reverse() + ", src: " + src);
        return dest;
        
    }
}

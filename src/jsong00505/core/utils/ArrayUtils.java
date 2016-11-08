package jsong00505.core.utils;

import java.lang.reflect.Array;

public class ArrayUtils {
    public int[] concatenate (int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;


        int[] c = new int[aLen+bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);

        return c;
    }
}
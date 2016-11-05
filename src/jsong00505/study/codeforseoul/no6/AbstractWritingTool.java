package jsong00505.study.codeforseoul.no6;

/**
 * Created by jsong on 11/5/16.
 */
public abstract class AbstractWritingTool {
    public static int subtract(int a, int b) {
        return a - b;
    }

    public String material;
    public int thickness;

    public void write(String text) {
        System.out.println(text);
    }
}

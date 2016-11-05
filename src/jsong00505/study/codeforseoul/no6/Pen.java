package jsong00505.study.codeforseoul.no6;

/**
 * Created by jsong on 11/5/16.
 */
public class Pen extends AbstractWritingTool {
    // guarantees AbstractWritingTool has write() and abstract() methods
    @Override
    public void write(String text) {
        material = "ink";
        super.write(text + " written by "+material);

    }

}

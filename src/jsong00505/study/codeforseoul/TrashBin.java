package jsong00505.study.codeforseoul;

/**
 * Created by jsong on 10/29/16.
 */
public class TrashBin extends Bin {

    @Override
    public void store(Object obj) {
        System.out.println("Trashing: " + obj.toString());
    }
}

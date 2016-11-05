package jsong00505.study.codeforseoul.no6;

/**
 * Created by jsong on 11/5/16.
 */
public class AbstractStaticMain {
    public static void main(String[] args) {
        System.out.println("maxSpeed: " + Helper.maxSpeed);

        int sum = Helper.add(2, 3);
        System.out.println("sum:  " + sum);

        Math.abs(sum); // this is the best example of static
        // Math has abstract concept
        //AbstractWritingTool myObj = new AbstractWritingTool(); // We can't initiate like this
        AbstractWritingTool myObj = new Pen();
        AbstractWritingTool myPencil = new Pencil();
        Pen myPen = new Pen();

        myObj.write("text to write");
        // interfaces guarantees behavior


    }

}

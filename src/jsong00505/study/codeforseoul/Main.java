package jsong00505.study.codeforseoul;

import java.io.FileReader;
import java.util.IllegalFormatCodePointException;
import java.io.BufferedReader;

/**
 * Created by jsong on 10/29/16.
 * I got errors from this time because of stupid intellij
 * IntelliJ should make interface by interface.
 * Do not create interface by java source.
 */
public class Main {
    public static void main(String[] args) {
        Bin oneBin = new Bin();
        oneBin.store(new Object());

        TrashBin twoBin = new TrashBin();
        twoBin.store(new Object());

        // Closable
        // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try {
            throw new ExceptionInInitializerError();
        }catch(ExceptionInInitializerError | IllegalFormatCodePointException e) {
            e.printStackTrace();

        } finally {
            System.out.println("DONE");
        }

        String path = "";
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            br.readLine();
        } catch(Exception e) {

        } finally {

        }
    }
}

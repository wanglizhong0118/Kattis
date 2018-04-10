package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/skocimis
 * 
 * @author allwi
 *
 */
public class Skocimis {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int a = Integer.parseInt(sts[0]);
        int b = Integer.parseInt(sts[1]);
        int c = Integer.parseInt(sts[2]);

        if (b - a > c - b) {
            w.write(String.valueOf(b - a - 1));
        } else {
            w.write(String.valueOf(c - b - 1));
        }
        w.flush();
        w.close();
        r.close();
    }

}

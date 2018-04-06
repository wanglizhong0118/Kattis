package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/slatkisi
 * 
 * @author allwi
 *
 */
public class Slatkisi {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] sts = r.readLine().split(" ");

        int c = Integer.parseInt(sts[0]);
        int k = Integer.parseInt(sts[1]);

        int tempk = (int) Math.pow(10, k);
        int tempc = c % tempk;

        int re = 0;
        if (tempk - tempc > tempk / 2) {
            re = c - tempc;
        } else {
            re = c + tempk - tempc;
        }

        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();

    }
}

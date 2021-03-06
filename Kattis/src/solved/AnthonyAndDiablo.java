package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/anthonyanddiablo
 * 
 * @author allwi
 *
 */
public class AnthonyAndDiablo {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        double a = Double.parseDouble(sts[0]);
        double n = Double.parseDouble(sts[1]);
        double max = Math.pow(n, 2) / (4 * Math.PI);
        if (a <= max) {
            w.write("Diablo is happy!");
        } else {
            w.write("Need more materials!");
        }
        w.flush();
        w.close();
        r.close();
    }
}

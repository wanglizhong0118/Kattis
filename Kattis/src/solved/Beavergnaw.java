package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/beavergnaw
 * 
 * @author allwi
 *
 */
public class Beavergnaw {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0 0")) {
                break;
            }
            String[] sts = line.split(" ");
            double d = Double.parseDouble(sts[0]);
            double v = Double.parseDouble(sts[1]);

            double t1 = Math.pow(d, 3) - 6 * v / Math.PI;
            double re = Math.pow(t1, (1.0 / 3.0));
            w.write(String.valueOf(re) + "\n");
        }
        w.flush();
        w.close();
        r.close();

    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/differentdistances
 * 
 * @author allwi
 *
 */
public class DifferentDistances {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            String[] sts = line.split(" ");

            double x1 = Double.parseDouble(sts[0]);
            double y1 = Double.parseDouble(sts[1]);
            double x2 = Double.parseDouble(sts[2]);
            double y2 = Double.parseDouble(sts[3]);
            double p = Double.parseDouble(sts[4]);

            double tempx = Math.pow(Math.abs(x1 - x2), p);
            double tempy = Math.pow(Math.abs(y1 - y2), p);
            double re = Math.pow(tempx + tempy, (1 / p));
            w.write(String.valueOf(re) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

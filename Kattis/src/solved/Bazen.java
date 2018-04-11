package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/bazen
 * 
 * @author allwi
 *
 */
public class Bazen {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        double x = Double.parseDouble(sts[0]);
        double y = Double.parseDouble(sts[1]);

        double tx = -1;
        double ty = -1;

        if (x == 0 && y == 0) {
            tx = 125;
            ty = 125;
        } else if (y == 0) {
            double k = 250 / -x;
            if (x <= 125) {
                ty = 125 * k / (1 + k);
                tx = 250 - ty;
            } else {
                tx = 0;
                ty = k * -125;
            }
        } else if (x == 0) {
            double k = y / -250;
            if (y <= 125) {
                tx = 125 / (1 + k);
                ty = 250 - tx;
            } else {
                ty = 0;
                tx = 125 / -k;
            }
        } else {
            double k = y / x;
            if (x <= 125) {
                tx = 125 * (k - 1) / k;
                ty = 0;
            } else {
                ty = 125 - 125 * k;
                tx = 0;
            }
        }
        String xs = String.format("%.2f", tx);
        String ys = String.format("%.2f", ty);
        w.write(xs + " " + ys);

        w.flush();
        w.close();
        r.close();

    }

}

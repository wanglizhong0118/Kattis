package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/humancannonball2
 * 
 * @author allwi
 *
 */
public class TheAmazingHumanCannonball {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        int i = 0;
        while (i++ < n) {
            String[] sts = r.readLine().split(" ");
            boolean isSafe = false;
            final double v0 = Double.parseDouble(sts[0]);
            final double si = Math.toRadians(Double.parseDouble(sts[1]));
            final double x = Double.parseDouble(sts[2]);
            final double h1 = Double.parseDouble(sts[3]);
            final double h2 = Double.parseDouble(sts[04]);
            final double t = x / (v0 * Math.cos(si));
            final double h = (v0 * t * Math.sin(si)) - (9.81 * t * t / 2);

            if (h > (h1 + 1) && h < (h2 - 1)) {
                isSafe = true;
            }
            if (isSafe) {
                w.write("Safe\n");
            } else {
                w.write("Not Safe\n");
            }

        }
        w.flush();
        w.close();
        r.close();
    }
}

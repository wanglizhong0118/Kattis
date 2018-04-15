package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/ornaments
 * 
 * @author allwi
 *
 */
public class Ornaments {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0 0 0")) {
                break;
            }

            String[] sts = line.split(" ");
            double ra = Double.parseDouble(sts[0]);
            double hi = Double.parseDouble(sts[1]);
            double s = Double.parseDouble(sts[2]);

            double circlePerimeter = 2 * Math.PI * ra;
            double sectionPerimeter = 2 * ra * Math.acos(ra / hi);
            double twolines = 2 * Math.sqrt(hi * hi - ra * ra);

            double total = (circlePerimeter - sectionPerimeter + twolines) * (100 + s) / 100;

            w.write(String.format("%.2f", total) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

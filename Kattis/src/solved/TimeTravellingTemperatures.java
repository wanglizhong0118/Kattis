package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/temperature
 * 
 * @author allwi
 *
 */
public class TimeTravellingTemperatures {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        double x = Integer.parseInt(sts[0]);
        double y = Integer.parseInt(sts[1]);

        if (x == 0 && y == 1) {
            w.write("ALL GOOD");
        } else if (y == 1) {
            w.write("IMPOSSIBLE");
        } else {
            double temp = x / (1.0 - y);
            w.write(String.valueOf(temp));
        }
        w.flush();
        w.close();
        r.close();
    }

}

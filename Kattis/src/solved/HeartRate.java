package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/heartrate
 * 
 * @author allwi
 *
 */
public class HeartRate {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            double b = Double.parseDouble(sts[0]);
            double p = Double.parseDouble(sts[1]);

            double re1 = (b - 1) / p * 60;
            double re2 = b / p * 60;
            double re3 = (b + 1) / p * 60;
            w.write(String.valueOf(re1) + " " + String.valueOf(re2) + " " + String.valueOf(re3) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

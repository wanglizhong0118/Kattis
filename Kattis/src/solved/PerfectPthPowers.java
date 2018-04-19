package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/perfectpowers
 * 
 * @author allwi
 *
 */
public class PerfectPthPowers {

    public static void main(String[] args) throws Exception {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            long n = Long.parseLong(r.readLine());
            if (n == 0) {
                break;
            }
            boolean isPositive = true;
            if (n < 0) {
                n = Math.abs(n);
                isPositive = false;
            }
            for (int p = 32; p >= 1; p--) {
                if (!isPositive && p % 2 == 0) {
                    continue;
                }
                long root = Math.round(Math.pow(n, 1.0 / p));
                long temp = 1;
                for (int i = 0; i < p; i++) {
                    temp *= root;
                }
                if (temp == n) {
                    w.write(String.valueOf(p) + "\n");
                    break;
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}
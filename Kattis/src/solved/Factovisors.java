package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/factovisors
 * 
 * @author allwi
 *
 */
public class Factovisors {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();

        while (line != null) {
            String[] sts = line.split(" ");
            int n = Integer.parseInt(sts[0]);
            int m = Integer.parseInt(sts[1]);

            boolean isFac = isFactorialDivide(n, m);

            if (isFac) {
                w.write(String.valueOf(m) + " divides " + String.valueOf(n) + "!\n");
            } else {
                w.write(String.valueOf(m) + " does not divide " + String.valueOf(n) + "!\n");
            }

            w.flush();
            line = r.readLine();
        }
        w.close();
        r.close();
    }

    private static boolean isFactorialDivide(int n, int m) {
        if (m == 0) {
            return false;
        }
        if (n == 0 && m == 1) {
            return true;
        }
        int mf = (int) (Math.sqrt(m) + 1);

        for (int f = 2; m > n && f < mf; ++f) {
            int c = 0;
            for (; m % f == 0; m /= f, ++c) {
            }
            for (int nf = f; c > 0 && nf <= n; c -= n / nf, nf *= f) {
            }
            if (c > 0)
                return false;
        }
        return m <= n;
    }
}

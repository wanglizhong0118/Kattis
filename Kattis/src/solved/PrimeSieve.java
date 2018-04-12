package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrimeSieve {

    private static byte[] prime;

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int n = Integer.parseInt(sts[0]);
        int q = Integer.parseInt(sts[1]);

        prime = new byte[n / 8 + 1];
        buildPrefix(n);

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primeOut(i)) {
                count++;
            }
        }

        w.write(String.valueOf(count) + "\n");

        for (int i = 0; i < q; i++) {
            int cur = Integer.parseInt(r.readLine());

            if (cur > 2 && cur % 2 == 0) {
                w.write("0\n");
            } else {
                if (primeOut(cur)) {
                    w.write("1\n");
                } else {
                    w.write("0\n");
                }
            }
        }

        w.flush();
        w.close();
        r.close();
    }

    static void buildPrefix(int max) {

        primeIn(0, 1);
        primeIn(1, 1);
        for (int p = 2; p * p <= max; p++) {
            if (primeOut(p)) {
                for (int i = 2; i * p <= max; i++)
                    primeIn(p * i, 1);
            }
        }

    }

    private static void primeIn(int i, int j) {
        int hel = i / 8;
        int lefts = i % 8;
        if (j == 1) {
            prime[hel] |= 1 << lefts;
        } else {
            prime[hel] &= ~(1 << lefts);
        }
    }

    private static boolean primeOut(int i) {
        int hel = i / 8;
        int lefts = i % 8;
        if ((prime[hel] & (1 << lefts)) == 0) {
            return true;
        }
        return false;
    }

}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/chineseremainder
 * 
 * @author allwi
 *
 */
public class ChineseRemainder {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(r.readLine());
        while (count-- > 0) {
            String[] sts = r.readLine().split(" ");
            BigInteger a1 = new BigInteger(sts[0]);
            BigInteger m1 = new BigInteger(sts[1]);
            BigInteger a2 = new BigInteger(sts[2]);
            BigInteger m2 = new BigInteger(sts[3]);

            BigInteger M = m1.multiply(m2);

            BigInteger re1 = a1.multiply(inverseModular(m2, m1)).multiply(m2);
            BigInteger re2 = a2.multiply(inverseModular(m1, m2)).multiply(m1);

            BigInteger x = (re1.add(re2)).mod(M);
            w.write(x.toString() + " " + M.toString() + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

    static BigInteger inverseModular(BigInteger a, BigInteger m) {
        BigInteger m0 = m;
        BigInteger t;
        BigInteger q;
        BigInteger x0 = BigInteger.ZERO;
        BigInteger x1 = BigInteger.ONE;

        if (m.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ZERO;
        }
        while (a.compareTo(BigInteger.ONE) > 0) {
            q = a.divide(m);
            t = m;
            m = a.mod(m);
            a = t;
            t = x0;
            x0 = x1.subtract(q.multiply(x0));
            x1 = t;
        }
        if (x1.compareTo(BigInteger.ZERO) < 0) {
            x1 = m0.add(x1);
        }
        return x1;
    }
}

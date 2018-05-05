package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/pseudoprime
 * 
 * @author allwi
 *
 */
public class PseudoprimeNumbers {

    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            String line = reader.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer s = new StringTokenizer(line);
            int p = Integer.parseInt(s.nextToken());
            if (!isPrime(p)) {
                int a = Integer.parseInt(s.nextToken());
                BigInteger ba = BigInteger.valueOf(a);
                BigInteger bp = BigInteger.valueOf(p);
                BigInteger res = ba.modPow(bp, bp);
                if (res.equals(ba)) {
                    writer.write("yes\n");
                } else {
                    writer.write("no\n");
                }
            } else {
                writer.write("no\n");
            }
        }
        writer.flush();
        writer.close();
        reader.close();

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
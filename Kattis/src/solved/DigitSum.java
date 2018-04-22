package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/digitsum
 * 
 * @author allwi
 *
 */
public class DigitSum {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        while (n-- > 0) {
            String[] sts = r.readLine().split(" ");
            long a = Long.parseLong(sts[0]);
            long b = Long.parseLong(sts[1]);
            long oneToA = digitsSum(a);
            long oneToB = digitsSum(b + 1);
            long sum = oneToB - oneToA;
            w.write(String.valueOf(sum) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

    static long digitsSum(long n) {
        long sum = 0;
        if (n < 10) {
            sum = (n - 1) * n / 2;
        } else {
            long tens = digitsSum(n % 10) + 45 * (n / 10);
            long digs = digitsSum(n / 10) * 10 + (n % 10) * singelSum(n / 10);
            sum = tens + digs;
        }
        return sum;
    }

    static long singelSum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

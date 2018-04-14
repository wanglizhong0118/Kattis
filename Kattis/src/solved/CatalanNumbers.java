package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/catalan
 * 
 * @author allwi
 *
 */
public class CatalanNumbers {

    static BigInteger[] catalanNumber = new BigInteger[10001];

    public static void main(String[] args) throws IOException {

        catalanNumber[0] = BigInteger.ONE;
        getCatalanNumber();

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(r.readLine());
            BigInteger catalan = catalanNumber[m];
            w.write(String.valueOf(catalan) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

    public static void getCatalanNumber() {
        for (int i = 1; i < catalanNumber.length; i++) {
            BigInteger temp1 = catalanNumber[i - 1].multiply(BigInteger.valueOf(4 * i - 2));
            catalanNumber[i] = temp1.divide(BigInteger.valueOf(i + 1));
        }
    }

}

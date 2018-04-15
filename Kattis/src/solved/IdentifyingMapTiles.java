package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/maptiles2
 * 
 * @author allwi
 *
 */
public class IdentifyingMapTiles {

    static BigInteger bigOne = BigInteger.ONE;
    static BigInteger bigTwo = bigOne.add(bigOne);
    static BigInteger bigThree = bigTwo.add(bigOne);

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        String rline = new StringBuilder(line).reverse().toString();
        int len = rline.length();

        BigInteger bigx = BigInteger.ZERO;
        BigInteger bigy = BigInteger.ZERO;

        BigInteger bigLine = new BigInteger(rline);

        for (int i = 0; i < len; i++) {
            BigInteger cur = bigLine.mod(BigInteger.TEN);

            bigx = bigx.multiply(bigTwo);
            bigy = bigy.multiply(bigTwo);

            if (cur.equals(bigOne) || cur.equals(bigThree)) {
                bigx = bigx.add(bigOne);
            }

            if (cur.equals(bigTwo) || cur.equals(bigThree)) {
                bigy = bigy.add(bigOne);
            }

            bigLine = bigLine.divide(BigInteger.TEN);
        }

        w.write(String.valueOf(len) + " " + String.valueOf(bigx) + " " + String.valueOf(bigy));
        w.flush();
        w.close();
        r.close();

    }
}

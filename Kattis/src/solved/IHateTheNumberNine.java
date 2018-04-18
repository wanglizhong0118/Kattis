package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/nine
 * 
 * @author allwi
 *
 */
public class IHateTheNumberNine {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger bigEight = BigInteger.valueOf(8);
        BigInteger bigNine = BigInteger.valueOf(9);
        BigInteger modRes = BigInteger.valueOf(1000000007);

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            BigInteger digs = new BigInteger(r.readLine());
            // 8 * 9^(digs-1) mod m
            // (A * B) mod C = (A mod C * B mod C) mod C
            BigInteger temp1 = bigNine.modPow(digs.subtract(BigInteger.ONE), modRes);
            BigInteger temp2 = bigEight.mod(modRes);
            BigInteger tempc = temp1.multiply(temp2).mod(modRes);
            w.write(tempc.toString() + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/simpleaddition
 * 
 * @author allwi
 *
 */
public class SimpleAddition {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger b1 = new BigInteger(r.readLine());
        BigInteger b2 = new BigInteger(r.readLine());

        BigInteger re = b1.add(b2);

        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();
    }

}

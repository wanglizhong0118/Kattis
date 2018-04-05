package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/arithmetic
 * 
 * @author allwi
 *
 */
public class Arithmetic {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final String in = r.readLine();
        BigInteger bi = new BigInteger(in, 8);
        String hex = bi.toString(16);
        w.write(String.valueOf(hex).toUpperCase());
        w.flush();
        w.close();
        r.close();
    }
}
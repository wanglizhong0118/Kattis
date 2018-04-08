package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/areal
 * 
 * @author allwi
 *
 */
public class ARealChallenge {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final long n = Long.parseLong(r.readLine());
        final double s = Math.sqrt(n);
        final double p = 4 * s;

        w.write(String.valueOf(p));
        w.flush();
        w.close();
        r.close();
    }

}

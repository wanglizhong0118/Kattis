package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/sjecista
 * 
 * @author allwi
 *
 */
public class Sjecista {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        final int re = n * (n - 1) * (n - 2) * (n - 3) / 24;

        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();
    }

}

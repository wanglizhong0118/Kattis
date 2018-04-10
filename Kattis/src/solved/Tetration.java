package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/tetration
 * 
 * @author allwi
 *
 */
public class Tetration {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(r.readLine());

        double re = Math.pow(n, 1 / n);

        w.write("" + re);
        w.flush();
    }
}

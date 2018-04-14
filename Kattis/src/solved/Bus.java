package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/bus
 * 
 * @author allwi
 *
 */
public class Bus {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            int m = Integer.parseInt(r.readLine());
            int re = (int) (Math.pow(2, m) - 1);
            w.write(String.valueOf(re) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

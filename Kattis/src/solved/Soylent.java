package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/soylent
 * 
 * @author allwi
 *
 */
public class Soylent {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(r.readLine());
            if (cur % 400 == 0) {
                w.write(String.valueOf(cur / 400) + "\n");
            } else {
                w.write(String.valueOf(cur / 400 + 1) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

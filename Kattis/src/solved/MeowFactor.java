package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/meowfactor
 * 
 * @author allwi
 *
 */
public class MeowFactor {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(r.readLine());
        long currentMax = 1;
        for (long m = 128; m >= 2; m--) {
            if (n % (m * m * m * m * m * m * m * m * m) == 0) {
                currentMax = m;
                break;
            }
        }
        w.write(String.valueOf(currentMax));
        w.flush();
        w.close();
        r.close();
    }
}

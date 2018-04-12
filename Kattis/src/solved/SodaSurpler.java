package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/sodasurpler
 * 
 * @author allwi
 *
 */
public class SodaSurpler {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int e = Integer.parseInt(sts[0]);
        int f = Integer.parseInt(sts[1]);
        int c = Integer.parseInt(sts[2]);

        int t = e + f;

        int sum = 0;

        while (t >= c) {
            t -= c;
            sum++;
            t++;
        }
        w.write(String.valueOf(sum));
        w.flush();
    }
}

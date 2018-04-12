package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/prsteni
 * 
 * @author allwi
 *
 */
public class Prsteni {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        r.readLine();

        String[] sts = r.readLine().split(" ");

        int curr = Integer.parseInt(sts[0]);
        for (int i = 1; i < sts.length; i++) {
            int next = Integer.parseInt(sts[i]);
            int gcd = gcd(curr, next);
            int up = curr / gcd;
            int down = next / gcd;
            String s = up + "/" + down + "\n";
            w.write(s);
        }
        w.flush();
        w.close();
        r.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

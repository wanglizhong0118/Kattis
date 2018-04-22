package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/flyingsafely
 * 
 * @author allwi
 *
 */
public class FlyingSafely {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(r.readLine());

        while (count-- > 0) {
            StringTokenizer s = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(s.nextToken());
            int m = Integer.parseInt(s.nextToken());
            for (int i = 0; i < m; i++) {
                r.readLine();
            }
            w.write(String.valueOf(n - 1) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

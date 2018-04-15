package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/sumoftheothers
 * 
 * @author allwi
 *
 */
public class SumoftheOthers {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {
            int sum = 0;
            StringTokenizer s = new StringTokenizer(line);
            while (s.hasMoreTokens()) {
                sum += Integer.parseInt(s.nextToken());
            }

            w.write(String.valueOf(sum / 2) + "\n");
            w.flush();
        }
    }
}

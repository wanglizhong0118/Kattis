package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/anothercandies
 * 
 * @author allwi
 *
 */
public class AnotherCandies {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        int i = 0;
        while (i++ < n) {
            r.readLine();
            int count = Integer.parseInt(r.readLine());
            long sum = 0;
            int j = 0;
            while (j++ < count) {
                sum += Long.parseLong(r.readLine()) % count;
            }
            if (sum % count == 0) {
                w.write("YES\n");
            } else {
                w.write("NO\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

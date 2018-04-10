package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/parking2
 * 
 * @author allwi
 *
 */
public class Parking2 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(r.readLine());
            String[] sts = r.readLine().split(" ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < m; j++) {
                int cur = Integer.parseInt(sts[j]);
                if (cur > max) {
                    max = cur;
                }
                if (cur < min) {
                    min = cur;
                }
            }
            int re = (max - min) * 2;
            w.write(String.valueOf(re) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/vote
 * 
 * @author allwi
 *
 */
public class PopularVote {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            int m = Integer.parseInt(r.readLine());

            int sum = 0;
            int pos = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            boolean now = false;
            for (int j = 0; j < m; j++) {
                int current = Integer.parseInt(r.readLine());
                if (current > max) {
                    max = current;
                    pos = j + 1;
                    now = false;
                } else if (current == max) {
                    now = true;
                }
                sum += current;
            }
            if (now) {
                w.write("no winner\n");
            } else if (max > sum - max) {
                w.write("majority winner " + String.valueOf(pos) + "\n");
            } else {
                w.write("minority winner " + String.valueOf(pos) + "\n");
            }

        }
        w.flush();
        w.close();
        r.close();
    }
}

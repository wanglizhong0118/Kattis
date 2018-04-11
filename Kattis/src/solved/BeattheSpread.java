package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/beatspread
 * 
 * @author allwi
 *
 */
public class BeattheSpread {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");
            int sum = Integer.parseInt(sts[0]);
            int dif = Integer.parseInt(sts[1]);

            if (dif > sum) {
                w.write("impossible\n");
            } else {
                if ((sum + dif) % 2 != 0) {
                    w.write("impossible\n");
                } else {
                    int large = (sum + dif) / 2;
                    int small = sum - large;
                    w.write(String.valueOf(large) + " " + String.valueOf(small) + "\n");
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}

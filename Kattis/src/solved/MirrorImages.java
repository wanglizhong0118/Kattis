package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/mirror
 * 
 * @author allwi
 *
 */
public class MirrorImages {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            int rr = Integer.parseInt(sts[0]);
            int cc = Integer.parseInt(sts[1]);

            String[] temp = new String[rr];

            for (int j = rr - 1; j >= 0; j--) {
                String cur = r.readLine();
                String reverse = new StringBuilder(cur).reverse().toString();
                temp[j] = reverse;
            }

            w.write("Test " + String.valueOf(i + 1) + "\n");
            for (String s : temp) {
                w.write(s + "\n");
            }

        }

        w.flush();
        w.close();
        r.close();
    }

}

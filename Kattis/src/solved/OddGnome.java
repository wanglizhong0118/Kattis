package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/ptice
 * 
 * @author allwi
 *
 */
public class OddGnome {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            int m = Integer.parseInt(sts[0]);
            int pos = 0;
            for (int j = 1; j < m - 1; j++) {
                int pr = Integer.parseInt(sts[j]);
                int ne = Integer.parseInt(sts[j + 1]);
                if (pr + 1 != ne) {
                    pos = j + 1;
                    break;
                }
            }
            w.write(String.valueOf(pos) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}

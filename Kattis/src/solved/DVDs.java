package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/dvds
 * 
 * @author allwi
 *
 */
public class DVDs {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        r.readLine();
        while (r.readLine() != null) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            int op = 0;
            int pos = 1;
            while (st.hasMoreTokens()) {
                int curNr = Integer.parseInt(st.nextToken());
                if (curNr != pos) {
                    op++;
                } else {
                    pos++;
                }
            }
            w.write(String.valueOf(op) + "\n");
            w.flush();
        }
        w.close();
        r.close();
    }
}

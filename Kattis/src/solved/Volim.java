package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/volim
 * 
 * @author allwi
 *
 */
public class Volim {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());
        int time = 0;
        while (n-- > 0) {
            String[] sts = r.readLine().split(" ");
            int t = Integer.parseInt(sts[0]);
            String z = sts[1];
            time += t;
            if (time >= 210) {
                w.write(String.valueOf(k) + "\n");
                break;
            }
            if (z.equals("T")) {
                if (k == 8) {
                    k = 1;
                } else {
                    k++;
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

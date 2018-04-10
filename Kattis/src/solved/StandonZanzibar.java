package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/zanzibar
 * 
 * @author allwi
 *
 */
public class StandonZanzibar {
    
    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        int i = 0;
        while (i++ < n) {
            String[] sts = r.readLine().split(" ");
            int tota = 0;
            int prev = 1;
            for (int j = 0; j < sts.length - 1; j++) {
                int cur = Integer.parseInt(sts[j]);
                tota += Math.max(0, cur - prev * 2);
                prev = cur;
            }
            w.write(String.valueOf(tota) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

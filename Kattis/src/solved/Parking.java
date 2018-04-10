package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/parking
 * 
 * @author allwi
 *
 */
public class Parking {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] prs = r.readLine().split(" ");
        int p1 = Integer.parseInt(prs[0]);
        int p2 = Integer.parseInt(prs[1]) * 2;
        int p3 = Integer.parseInt(prs[2]) * 3;

        String[] t1 = r.readLine().split(" ");
        String[] t2 = r.readLine().split(" ");
        String[] t3 = r.readLine().split(" ");

        int t1s = Integer.parseInt(t1[0]);
        int t1e = Integer.parseInt(t1[1]);

        int t2s = Integer.parseInt(t2[0]);
        int t2e = Integer.parseInt(t2[1]);

        int t3s = Integer.parseInt(t3[0]);
        int t3e = Integer.parseInt(t3[1]);

        int start = Math.min(t1s, Math.min(t2s, t3s));
        int end = Math.max(t1e, Math.max(t2e, t3e));

        int sum = 0;
        for (int i = start; i < end; i++) {
            int temp = 0;
            if (i >= t1s && i < t1e) {
                temp++;
            }
            if (i >= t2s && i < t2e) {
                temp++;
            }
            if (i >= t3s && i < t3e) {
                temp++;
            }
            if (temp == 1) {
                sum += p1;
            } else if (temp == 2) {
                sum += p2;
            } else if (temp == 3) {
                sum += p3;
            } else {
                sum += 0;
            }
        }

        System.out.println(sum);

        w.flush();
        w.close();
        r.close();

    }

}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/bottledup
 * 
 * @author allwi
 *
 */
public class BottledUpFeelings {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int s = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        if (s % v1 == 0) {
            w.write(String.valueOf(s / v1) + " 0");
        } else {
            int curmax = s / v1;
            int nv1 = -1;
            int nv2 = -1;
            boolean isPossible = false;
            for (int i = curmax; i >= 0; i--) {
                int rest = s - i * v1;
                if (rest % v2 == 0) {
                    nv1 = i;
                    nv2 = rest / v2;
                    isPossible = true;
                    break;
                }
            }
            if (isPossible) {
                w.write(String.valueOf(nv1) + " " + String.valueOf(nv2));
            } else {
                w.write("Impossible");
            }
        }

        w.flush();
        w.close();
        r.close();
    }

}

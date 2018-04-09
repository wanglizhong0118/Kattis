package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/sumkindofproblem
 * 
 * @author allwi
 *
 */
public class SumKindofProblem {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");

            int m = Integer.parseInt(sts[0]);
            int k = Integer.parseInt(sts[1]);

            StringBuilder sb = new StringBuilder();

            int s1 = (1 + k) * k / 2;
            int s2 = k * k;
            int s3 = k * (k + 1);

            sb.append(m).append(" ");
            sb.append(s1).append(" ");
            sb.append(s2).append(" ");
            sb.append(s3).append(" ");

            w.write(sb.toString() + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

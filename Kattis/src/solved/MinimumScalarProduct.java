package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/minimumscalar
 * 
 * @author allwi
 *
 */
public class MinimumScalarProduct {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            int m = Integer.parseInt(r.readLine());

            List<Long> ls1 = new ArrayList<>();
            StringTokenizer s1 = new StringTokenizer(r.readLine());
            while (s1.hasMoreTokens()) {
                long cur = Long.parseLong(s1.nextToken());
                ls1.add(cur);
            }
            Collections.sort(ls1);

            List<Long> ls2 = new ArrayList<>();
            StringTokenizer s2 = new StringTokenizer(r.readLine());
            while (s2.hasMoreTokens()) {
                long cur = Long.parseLong(s2.nextToken());
                ls2.add(cur);
            }
            Collections.sort(ls2);

            long sum = 0;
            for (int j = 0; j < m; j++) {
                long temp = ls1.get(j) * ls2.get(m - 1 - j);
                sum += temp;
            }
            String re = "Case #" + (i + 1) + ": ";
            w.write(re + String.valueOf(sum) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}

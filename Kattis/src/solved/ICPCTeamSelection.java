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
 * https://open.kattis.com/problems/icpcteamselection
 * 
 * @author allwi
 *
 */
public class ICPCTeamSelection {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(r.readLine());

        for (int i = 0; i < cases; i++) {
            int n = Integer.parseInt(r.readLine());
            StringTokenizer st = new StringTokenizer(r.readLine());
            List<Integer> ls = new ArrayList<>();
            while (st.hasMoreTokens()) {
                ls.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(ls);
            int count = 0;
            int sum = 0;
            for (int m = ls.size() - 2; m >= 0; m = m - 2) {
                if (count == n) {
                    break;
                }
                sum += ls.get(m);
                count++;
            }
            w.write(String.valueOf(sum) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

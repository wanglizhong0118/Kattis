package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://open.kattis.com/problems/synchronizinglists
 * 
 * @author allwi
 *
 */
public class SynchronizingLists {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);

            List<Integer> ls1 = new ArrayList<>();
            List<Integer> sortls1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(r.readLine());
                ls1.add(cur);
                sortls1.add(cur);
            }
            Collections.sort(sortls1);

            List<Integer> sortls2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(r.readLine());
                sortls2.add(cur);
            }
            Collections.sort(sortls2);

            for (int i = 0; i < n; i++) {
                int org = ls1.get(i);
                int pos = sortls1.indexOf(org);
                int cur = sortls2.get(pos);
                w.write(String.valueOf(cur) + "\n");
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();

    }
}

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
 * https://open.kattis.com/problems/phonelist
 * 
 * @author allwi
 *
 */
public class PhoneList {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        int i = 0;
        while (i++ < n) {
            final int m = Integer.parseInt(r.readLine());
            List<String> ls = new ArrayList<>();
            int j = 0;
            while (j++ < m) {
                final String cur = r.readLine();
                ls.add(cur);
            }
            Collections.sort(ls);
            boolean isVaild = true;
            for (int k = 0; k < ls.size() - 1; k++) {
                if (ls.get(k + 1).startsWith(ls.get(k))) {
                    isVaild = false;
                    break;
                }
            }
            if (isVaild) {
                w.write("YES\n");
            } else {
                w.write("NO\n");
            }

        }
        w.flush();
        w.close();
        r.close();
    }

}

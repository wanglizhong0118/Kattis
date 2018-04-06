package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * https://open.kattis.com/problems/oddmanout
 * 
 * @author allwi
 *
 */
public class OddManOut {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            r.readLine();
            final String[] sts = r.readLine().split(" ");
            Set<String> odd = new HashSet<>();
            for (String s : sts) {
                if (!odd.add(s)) {
                    odd.remove(s);
                }
            }
            for (String s : odd) {
                w.write("Case #" + String.valueOf(i + 1) + ": " + s + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}

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
 * https://open.kattis.com/problems/akcija
 * 
 * @author allwi
 *
 */
public class Akcija {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        int i = 0;
        List<Integer> ls = new ArrayList<>();
        while (i++ < n) {
            ls.add(Integer.parseInt(r.readLine()));
        }

        Collections.sort(ls, Collections.reverseOrder());

        int sum = 0;
        final int len = ls.size();
        if (len < 3) {
            for (int c : ls) {
                sum += c;
            }
        } else {
            for (int j = 0; j < len; j++) {
                if ((j + 1) % 3 != 0) {
                    sum += ls.get(j);
                }
            }
        }
        w.write(String.valueOf(sum));
        w.flush();
        w.close();
        r.close();
    }

}

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
 * https://open.kattis.com/problems/shopaholic
 * 
 * @author allwi
 *
 */
public class Shopaholic {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        r.readLine();

        List<Long> ls = new ArrayList<>();
        String[] sts = r.readLine().split(" ");
        for (String s : sts) {
            ls.add(Long.parseLong(s));
        }
        Collections.sort(ls);
        Collections.reverse(ls);

        long sum = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (i % 3 == 2) {
                sum += ls.get(i);
            }
        }
        w.write(String.valueOf(sum));
        w.flush();
        w.close();
        r.close();
    }

}

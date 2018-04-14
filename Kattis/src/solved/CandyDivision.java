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
 * https://open.kattis.com/problems/candydivision
 * 
 * @author allwi
 *
 */
public class CandyDivision {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(r.readLine());
        List<Long> ls = new ArrayList<>();
        long mid = (long) Math.sqrt(n);
        if (Math.pow(mid, 2) == n) {
            ls.add(mid - 1);
        }
        for (long i = 0; i < Math.sqrt(n) - 1; i++) {
            if (n % (i + 1) == 0) {
                ls.add(i);
                ls.add(n / (i + 1) - 1);
            }
        }
        Collections.sort(ls);
        for (long l : ls) {
            w.write(String.valueOf(l) + " ");
        }
        w.flush();
        w.close();
        r.close();
    }
}

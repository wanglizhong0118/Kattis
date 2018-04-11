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
 * https://open.kattis.com/problems/stickysituation
 * 
 * @author allwi
 *
 */
public class StickySituation {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        String[] sts = r.readLine().split(" ");
        List<Long> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ls.add(Long.parseLong(sts[i]));
        }
        Collections.sort(ls);

        boolean isFound = false;
        for (int i = 0; i < n - 2; i++) {
            if (isTriangle(ls.get(i), ls.get(i + 1), ls.get(i + 2))) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            w.write("possible\n");
        } else {
            w.write("impossible\n");
        }
        w.flush();
    }

    static boolean isTriangle(long a, long b, long c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        }
        return false;
    }
}

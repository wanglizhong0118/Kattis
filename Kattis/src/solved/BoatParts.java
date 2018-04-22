package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/boatparts
 * 
 * @author allwi
 *
 */
public class BoatParts {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(r.readLine());
        int p = Integer.parseInt(s.nextToken());
        int n = Integer.parseInt(s.nextToken());
        Set<String> set = new HashSet<>();
        boolean isBreak = false;
        for (int i = 1; i <= n; i++) {
            if (set.size() != p) {
                set.add(r.readLine());
            }
            if (set.size() == p) {
                w.write(String.valueOf(i) + "\n");
                isBreak = true;
                break;
            }
        }
        if (!isBreak) {
            w.write("paradox avoided\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

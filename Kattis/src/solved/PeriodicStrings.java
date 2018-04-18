package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/periodicstrings
 * 
 * @author allwi
 *
 */
public class PeriodicStrings {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        int len = line.length();
        int period = 0;
        for (int i = 1; i <= len; i++) {
            if (len % i == 0) {
                String first = line.substring(0, i);
                boolean isPeriodic = true;
                for (int j = i; j <= len - i; j += i) {
                    String next = line.substring(j, j + i);
                    if (!isRefresh(first, next)) {
                        isPeriodic = false;
                        break;
                    }
                    first = next;
                }
                if (isPeriodic) {
                    period = i;
                    break;
                }
            }
        }
        w.write(String.valueOf(period));
        w.flush();
        w.close();
        r.close();
    }

    static boolean isRefresh(String first, String next) {

        boolean headBody = true;
        boolean bodyHead = true;

        for (int i = 0; i < first.length() - 1; i++) {
            if (first.charAt(i) != next.charAt(i + 1)) {
                headBody = false;
                break;
            }
        }
        bodyHead = (first.charAt(first.length() - 1) == next.charAt(0));
        return headBody && bodyHead;
    }
}

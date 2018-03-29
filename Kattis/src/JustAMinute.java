import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/justaminute
 * 
 * @author allwi
 *
 */
public class JustAMinute {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);
            int min = 0;
            int sec = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer s = new StringTokenizer(r.readLine());
                int tempMin = Integer.parseInt(s.nextToken());
                int tempSec = Integer.parseInt(s.nextToken());
                min += tempMin;
                sec += tempSec;
            }

            double s = (double) sec / (min * 60);
            if (s <= 1) {
                w.write("measurement error");
            } else {
                String rs = String.format("%.9f", s);
                w.write(rs);
            }
            w.flush();
        }
    }

}

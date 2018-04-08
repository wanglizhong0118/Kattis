package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/statistics
 * 
 * @author allwi
 *
 */
public class Statistics {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        String line;
        while ((line = r.readLine()) != null) {
            i++;
            String[] sts = line.split(" ");
            int n = Integer.parseInt(sts[0]);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 1; j < n + 1; j++) {
                int current = Integer.parseInt(sts[j]);
                if (current > max) {
                    max = current;
                }
                if (current < min) {
                    min = current;
                }
            }
            int range = max - min;
            String answer = "Case " + i + ": " + min + " " + max + " " + range + "\n";
            w.write(answer);
            // w.flush();
        }
        w.flush();
        w.close();
        r.close();
    }

}

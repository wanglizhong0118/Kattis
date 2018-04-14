package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/pervasiveheartmonitor
 * 
 * @author allwi
 *
 */
public class PervasiveHeartMonitor {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {

            double sum = 0;
            int count = 0;
            StringBuilder sb = new StringBuilder();
            String[] sts = line.split(" ");
            for (String s : sts) {
                if (Character.isDigit(s.charAt(0))) {
                    sum += Double.parseDouble(s);
                    count++;
                } else {
                    sb.append(s + " ");
                }
            }
            w.write(String.valueOf(sum / count) + " " + sb.toString() + "\n");
            w.flush();
        }
    }
}
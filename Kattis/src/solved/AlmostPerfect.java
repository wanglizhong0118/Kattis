package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/almostperfect
 * 
 * @author allwi
 *
 */
public class AlmostPerfect {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);
            int sum = 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i == n / i) {
                        sum += i;
                    } else {
                        sum += i;
                        sum += n / i;
                    }
                }
            }

            if (sum == n) {
                w.write(String.valueOf(n) + " perfect\n");
            } else if (Math.abs(sum - n) <= 2) {
                w.write(String.valueOf(n) + " almost perfect\n");
            } else {
                w.write(String.valueOf(n) + " not perfect\n");
            }
            w.flush();
        }
        w.close();
        r.close();
    }

}

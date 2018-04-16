package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/relatives
 * 
 * @author allwi
 *
 */
public class Relatives {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            int count = 1;
            for (int i = 2; i * i < n; i++) {
                int temp = 0;
                // Euler's totient function
                while (n % i == 0) {
                    if (temp > 0) {
                        count *= i;
                    } else {
                        count *= i - 1;
                    }
                    n /= i;
                    temp++;
                }
            }
            if (n > 1) {
                count *= n - 1;
            }
            w.write(String.valueOf(count) + "\n");

        }
        w.flush();
        w.close();
        r.close();
    }
}

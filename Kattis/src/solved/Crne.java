package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/crne
 * 
 * @author allwi
 *
 */
public class Crne {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(r.readLine());
        long inline = 0;
        // 2 -> 2 * 2
        // 4 -> 3 * 3
        // 6 -> 4 * 4
        // ...
        // n -> (n/2 + 1) * (n/2 + 1)
        if (n % 2 == 0) {
            inline = (n / 2 + 1) * (n / 2 + 1);
            w.write(String.valueOf(inline));
        } else {
            // 3 -> 2 * 3 -> 2 * 2 + 2
            // 5 -> 3 * 4 -> 3 * 3 + 3
            // 7 -> 4 * 5 -> 4 * 4 + 4
            // ...
            // n -> ((n+1)/2) * ((n+1)/2) - ((n+1)/2)
            inline = (n + 1) * (n + 3) / 4;
            w.write(String.valueOf(inline));
        }
        w.flush();
        w.close();
        r.close();
    }

}

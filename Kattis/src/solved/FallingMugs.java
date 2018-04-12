package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/falling
 * 
 * @author allwi
 *
 */
public class FallingMugs {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        int a = 0;
        int b = 0;
        boolean isFound = false;
        if (n % 2 == 1) {
            isFound = true;
            a = n / 2;
            b = n - a;
        } else if (n % 4 == 0) {
            isFound = true;
            int temp = n / 2;
            a = (temp - 2) / 2;
            b = temp - a;
        }

        if (isFound) {
            w.write(String.valueOf(a) + " " + String.valueOf(b));
        } else {
            w.write("impossible");
        }

        w.flush();
        w.close();
        r.close();
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/bishops
 * 
 * @author allwi
 *
 */
public class Bishops {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);
            if (n == 1) {
                w.write("1\n");
            } else {
                w.write(String.valueOf(n * 2 - 2) + "\n");
            }
            w.flush();
        }
    }
}

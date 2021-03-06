package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/ones
 * 
 * @author allwi
 *
 */
public class Ones {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        while (line != null) {
            int n = Integer.parseInt(line);
            int pos = 0;
            int first = 1;

            while (first % n != 0) {
                first = first * 10 + 1;
                first = first % n;
                pos++;
            }
            w.write(String.valueOf(pos + 1) + "\n");
            w.flush();
            line = r.readLine();
        }
        // w.flush();
        w.close();
        r.close();
    }

}

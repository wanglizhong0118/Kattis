package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/cetvrta
 * 
 * @author allwi
 *
 */
public class Cetvrta {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = 0;
        int y = 0;

        int i = 0;
        while (i++ < 3) {
            String[] sts = r.readLine().split(" ");
            x ^= Integer.parseInt(sts[0]);
            y ^= Integer.parseInt(sts[1]);
        }

        w.write(String.valueOf(x) + " " + String.valueOf(y));
        w.flush();
        w.close();
        r.close();
    }

}

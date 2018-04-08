package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/rijeci
 * 
 * @author allwi
 *
 */
public class Rijeci {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        for (int i = 0; i < n; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        int na = f3 - f1;
        int nb = f1;

        w.write(na + " " + nb);
        w.flush();
        w.close();
        r.close();
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/compass
 * 
 * @author allwi
 *
 */
public class JumbledCompass {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n1 = Integer.parseInt(r.readLine());
        final int n2 = Integer.parseInt(r.readLine());

        if (n1 == n2) {
            w.write("0");
        } else if (n1 < n2) {
            int t1 = n2 - n1;
            int t2 = 360 - n2 + n1;
            if (t1 <= t2) {
                w.write(String.valueOf(t1));
            } else {
                w.write(String.valueOf(-t2));
            }
        } else {
            int t1 = (360 - n1) + n2;
            int t2 = n1 - n2;
            if (t2 < t1) {
                w.write(String.valueOf(-t2));
            } else {
                w.write(String.valueOf(t1));
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}

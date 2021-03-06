package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/mixedfractions
 * 
 * @author allwi
 *
 */
public class MixedFractions {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            String[] sts = r.readLine().split(" ");
            if (sts[0].equals("0") && sts[1].equals("0")) {
                break;
            }
            int a = Integer.parseInt(sts[0]);
            int b = Integer.parseInt(sts[1]);
            if (a < b) {
                w.write(String.valueOf(0) + " " + String.valueOf(a) + " / " + String.valueOf(b) + "\n");
            } else {
                int mo = a % b;
                int c = a / b;
                w.write(String.valueOf(c) + " " + String.valueOf(mo) + " / " + String.valueOf(b) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

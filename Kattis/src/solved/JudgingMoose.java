package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/apaxiaaans
 * 
 * @author allwi
 *
 */
public class JudgingMoose {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = r.readLine().split(" ");
        int L = Integer.parseInt(lines[0]);
        int R = Integer.parseInt(lines[1]);

        if (L + R == 0) {
            w.write("Not a moose\n");
        } else {
            if (L > R) {
                w.write("Odd " + 2 * L + "\n");
            }
            if (L == R) {
                w.write("Even " + 2 * L + "\n");
            }
            if (L < R) {
                w.write("Odd " + 2 * R + "\n");
            }

        }
        w.flush();
        w.close();
        r.close();
    }
}

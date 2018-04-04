package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/bela
 * 
 * @author allwi
 *
 */
public class Bela {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int n = Integer.parseInt(sts[0]);
        String b = sts[1];
        int re = 0;
        int i = 0;
        while (i++ < 4 * n) {
            // A, K, Q, J, T, 9, 8, 7
            String s = r.readLine();
            if (s.contains("A")) {
                re += 11;
            } else if (s.contains("K")) {
                re += 4;
            } else if (s.contains("Q")) {
                re += 3;
            } else if (s.contains("J")) {
                if (s.contains(b)) {
                    re += 20;
                } else {
                    re += 2;
                }
            } else if (s.contains("T")) {
                re += 10;
            } else if (s.contains("9" + b)) {
                re += 14;
            }
        }
        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();
    }
}

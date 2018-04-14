package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/skener
 * 
 * @author allwi
 *
 */
public class Skener {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int rr = Integer.parseInt(sts[0]);
        int cc = Integer.parseInt(sts[1]);
        int zrr = Integer.parseInt(sts[2]);
        int zcc = Integer.parseInt(sts[3]);

        for (int i = 0; i < rr; i++) {
            String cur = r.readLine();
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < cc; j++) {
                for (int k = 0; k < zcc; k++) {
                    sb.append(cur.charAt(j));
                    w.write(String.valueOf(cur.charAt(j)));

                }
            }
            w.write("\n");

            for (int j = 1; j < zrr; j++) {
                w.write(sb.toString() + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

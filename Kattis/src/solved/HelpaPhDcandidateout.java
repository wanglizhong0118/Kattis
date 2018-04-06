package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/helpaphd
 * 
 * @author allwi
 *
 */
public class HelpaPhDcandidateout {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());

        int i = 0;
        while (i++ < n) {
            String s = r.readLine();
            if (s.equals("P=NP")) {
                w.write("skipped\n");
            } else {
                String[] sts = s.split("\\+");
                int re = Integer.parseInt(sts[0]) + Integer.parseInt(sts[1]);
                w.write(String.valueOf(re)+"\n");
            }
        }
        w.flush();
        w.close();
        r.close();

    }

}

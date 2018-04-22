package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/eligibility
 * 
 * @author allwi
 *
 */
public class Eligibility {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(r.readLine());

        while (count-- > 0) {
            String[] sts = r.readLine().split(" ");
            String name = sts[0];
            int sy = Integer.parseInt(sts[1].substring(0, 4));
            int by = Integer.parseInt(sts[2].substring(0, 4));
            int c = Integer.parseInt(sts[3]);

            if (sy >= 2010 || by >= 1991) {
                w.write(name + " eligible\n");
            } else if (c > 40) {
                w.write(name + " ineligible\n");
            } else {
                w.write(name + " coach petitions\n");
            }

        }
        w.flush();
        r.close();
        w.close();
    }
}

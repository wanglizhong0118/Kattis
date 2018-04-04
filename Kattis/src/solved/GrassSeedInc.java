package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/grassseed
 * 
 * @author allwi
 *
 */
public class GrassSeedInc {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        double c = Double.parseDouble(r.readLine());
        double l = Double.parseDouble(r.readLine());
        double re = 0;
        int i = 0;
        while (i++ < l) {
            String[] sts = r.readLine().split(" ");
            double wi = Double.parseDouble(sts[0]);
            double li = Double.parseDouble(sts[1]);
            double t = c * (wi * li);
            re += t;
        }
        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();

    }

}

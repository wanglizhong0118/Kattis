package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/inversefactorial
 * 
 * @author allwi
 *
 */
public class InverseFactorial {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        double len = line.length();

        if (line.equals("1")) {
            w.write("1");
        } else if (line.equals("2")) {
            w.write("2");
        } else if (line.equals("6")) {
            w.write("3");
        } else if (line.equals("24")) {
            w.write("4");
        } else if (line.equals("120")) {
            w.write("5");
        } else if (line.equals("720")) {
            w.write("6");
        } else {
            // https://www.geeksforgeeks.org/count-digits-factorial-set-2/
            for (int n = 2; n < Integer.MAX_VALUE; n++) {
                double lenTem = n * Math.log10(n / Math.E) + Math.log10(2 * Math.PI * n) / 2;
                int cur = (int) (Math.floor(lenTem) + 1);
                if (cur >= len) {
                    w.write(String.valueOf(n));
                    break;
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}

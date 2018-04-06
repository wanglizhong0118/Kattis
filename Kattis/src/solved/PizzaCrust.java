package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/pizza2
 * 
 * @author allwi
 *
 */
public class PizzaCrust {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] sts = r.readLine().split(" ");
        double a = Double.parseDouble(sts[0]);
        double b = Double.parseDouble(sts[1]);

        double ara = (Math.PI * Math.pow(a, 2));
        double arb = (Math.PI * Math.pow((a - b), 2));

        w.write(String.valueOf(arb / ara * 100));
        w.flush();
        w.close();
        r.close();
    }

}

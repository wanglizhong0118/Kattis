package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/smallestmultiple
 * 
 * @author allwi
 *
 */
public class SmallestMultiple {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();

        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            List<Integer> ls = new ArrayList<Integer>();
            while (st.hasMoreTokens()) {
                ls.add(Integer.parseInt(st.nextToken()));
            }
            w.write(findLCM(ls) + "\n");
            w.flush();
            line = r.readLine();
        }
        w.close();
        r.close();
    }

    public static BigInteger findLCM(List<Integer> ls) {

        BigInteger lcm = BigInteger.ONE;
        int currentPrime = 2;

        while (true) {
            int pos = 0;
            boolean divisible = false;

            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i) == 1) {
                    pos++;
                }
                if (ls.get(i) % currentPrime == 0) {
                    divisible = true;
                    ls.set(i, ls.get(i) / currentPrime);
                }
            }

            if (divisible) {
                lcm = lcm.multiply(BigInteger.valueOf(currentPrime));
            } else {
                currentPrime++;
            }

            if (pos == ls.size()) {
                return lcm;
            }
        }
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/easiest
 * 
 * @author allwi
 *
 */
public class TheEasiestProblemIsThisOne {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = r.readLine();
            if (s.equals("0")) {
                break;
            }
            int ans = 0;
            int sumorg = 0;
            for (char c : s.toCharArray()) {
                sumorg += Character.getNumericValue(c);
            }
            int n = Integer.parseInt(s);
            for (int i = 11; i < Integer.MAX_VALUE; i++) {
                int res = n * i;
                int sumtemp = 0;
                for (char c : String.valueOf(res).toCharArray()) {
                    sumtemp += Character.getNumericValue(c);
                }
                if (sumtemp == sumorg) {
                    ans = i;
                    break;
                }
            }
            w.write(String.valueOf(ans) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}

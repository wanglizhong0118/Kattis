package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/numberfun
 * 
 * @author allwi
 *
 */
public class NumberFun {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {
            int n = Integer.parseInt(line);

            for (int i = 0; i < n; i++) {
                String[] sts = r.readLine().split(" ");
                int first = Integer.parseInt(sts[0]);
                int second = Integer.parseInt(sts[1]);
                int third = Integer.parseInt(sts[2]);

                double r1 = (double) first / second;
                double r2 = (double) second / first;
                if (first + second == third || first * second == third || Math.abs(first - second) == third
                        || r1 == third || r2 == third) {
                    w.write("Possible\n");
                } else {
                    w.write("Impossible\n");
                }
            }
            w.flush();
        }
        w.close();
        r.close();
    }

}

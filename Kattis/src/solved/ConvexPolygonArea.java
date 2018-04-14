package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * https://open.kattis.com/problems/convexpolygonarea
 * 
 * @author allwi
 *
 */
public class ConvexPolygonArea {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");

            int m = Integer.parseInt(sts[0]);

            int[] x = new int[m];
            int[] y = new int[m];
            for (int j = 0; j < m; j++) {
                x[j] = Integer.parseInt(sts[2 * j + 1]);
                y[j] = Integer.parseInt(sts[2 * j + 2]);
            }

            double temp1 = 0;
            double temp2 = 0;

            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    temp1 += x[j] * y[0];
                    temp2 += y[j] * x[0];
                } else {
                    temp1 += x[j] * y[j + 1];
                    temp2 += y[j] * x[j + 1];
                }
            }

            double sum = Math.abs(temp1 - temp2) / 2;
            w.write(String.valueOf(sum) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

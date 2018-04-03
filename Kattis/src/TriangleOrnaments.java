import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/triangleornaments
 * 
 * @author allwi
 *
 */
public class TriangleOrnaments {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        int i = 0;
        double len = 0;
        while (i++ < n) {
            String[] sts = r.readLine().split(" ");
            int a = Integer.parseInt(sts[0]);
            int b = Integer.parseInt(sts[1]);
            int c = Integer.parseInt(sts[2]);

            double p = (double) (a + b + c) / 2;

            double temp = p * (p - a) * (p - b) * (p - c);

            // Heron's formula
            // https://en.wikipedia.org/wiki/Heron%27s_formula
            double area = (double) Math.sqrt(temp);

            // Median (geometry)
            // https://en.wikipedia.org/wiki/Median_(geometry)
            double medianC = (double) Math.sqrt(2 * (a * a + b * b) - c * c) / 2;

            double templen = 2 * area / medianC;
            len += templen;
        }
        w.write(String.valueOf(len) + "\n");
        w.flush();
        w.close();
        r.close();
    }
}

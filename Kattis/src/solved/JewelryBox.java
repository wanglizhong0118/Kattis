package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/jewelrybox
 * 
 * @author allwi
 *
 */
public class JewelryBox {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");

            double x = Double.parseDouble(sts[0]);
            double y = Double.parseDouble(sts[1]);

            double h1 = ((4 * x + 4 * y) + Math.sqrt(Math.pow((4 * x + 4 * y), 2) - 48 * x * y)) / 24;
            double h2 = ((4 * x + 4 * y) - Math.sqrt(Math.pow((4 * x + 4 * y), 2) - 48 * x * y)) / 24;

            double area1 = h1 * (x - 2 * h1) * (y - 2 * h1);
            double area2 = h2 * (x - 2 * h2) * (y - 2 * h2);

            w.write(String.valueOf(Math.max(area1, area2)) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/sok
 * 
 * @author allwi
 *
 */
public class Sok {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lite = r.readLine().split(" ");
        String[] ratio = r.readLine().split(" ");

        double r1 = Double.parseDouble(ratio[0]);
        double r2 = Double.parseDouble(ratio[1]);
        double r3 = Double.parseDouble(ratio[2]);

        double o1 = Double.parseDouble(lite[0]);
        double o2 = Double.parseDouble(lite[1]);
        double o3 = Double.parseDouble(lite[2]);

        double l1 = 0;
        double l2 = 0;
        double l3 = 0;

        double t1 = o1 / r1;
        double t2 = o2 / r2;
        double t3 = o3 / r3;

        double mint = Math.min(t1, Math.min(t2, t3));
        if (mint == t1) {
            l1 = 0;
            l2 = o2 - mint * r2;
            l3 = o3 - mint * r3;
        } else if (mint == t2) {
            l1 = o1 - mint * r1;
            l2 = 0;
            l3 = o3 - mint * r3;
        } else {
            l1 = o1 - mint * r1;
            l2 = o2 - mint * r2;
            l3 = 0;
        }

        String s1 = String.format("%.6f", l1);
        String s2 = String.format("%.6f", l2);
        String s3 = String.format("%.6f", l3);

        w.write(s1 + " " + s2 + " " + s3);
        w.flush();
    }
}

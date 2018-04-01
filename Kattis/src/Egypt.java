import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/egypt
 * 
 * @author allwi
 *
 */
public class Egypt {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0 0 0")) {
                break;
            }
            String sts[] = line.split(" ");
            int a = Integer.parseInt(sts[0]);
            int b = Integer.parseInt(sts[1]);
            int c = Integer.parseInt(sts[2]);

            int a1 = (int) Math.pow(a, 2);
            int b1 = (int) Math.pow(b, 2);
            int c1 = (int) Math.pow(c, 2);
            if (a1 + b1 == c1 || a1 + c1 == b1 || b1 + c1 == a1) {
                w.write("right\n");
            } else {
                w.write("wrong\n");
            }
        }
        w.flush();
        w.close();
        r.close();

    }

}

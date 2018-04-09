package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/halfacookie
 * 
 * @author allwi
 *
 */
public class HalfaCookie {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();

        while (line != null) {
            String[] sts = line.split(" ");
            double rr = Double.parseDouble(sts[0]);
            double xx = Double.parseDouble(sts[1]);
            double yy = Double.parseDouble(sts[2]);

            double cirarea = Math.PI * rr * rr;
            double temp = Math.sqrt(xx * xx + yy * yy);

            if (temp > rr) {
                w.write("miss\n");
            } else {
                double angle = 2 * Math.acos(temp / rr);
                double secarea = Math.abs(Math.PI * rr * rr * angle / (2 * Math.PI));
                double triarea = Math.abs(temp * temp * Math.tan(angle / 2));

                double area1 = secarea - triarea;
                double area2 = cirarea - area1;
                if (area1 <= area2) {
                    w.write(String.valueOf(area2) + " " + String.valueOf(area1) + "\n");
                } else {
                    w.write(String.valueOf(area1) + " " + String.valueOf(area2) + "\n");
                }
            }
            w.flush();
            line = r.readLine();
        }
        w.close();
        r.close();
    }

}

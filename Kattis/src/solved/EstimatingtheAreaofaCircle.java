package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/estimatingtheareaofacircle
 * 
 * @author allwi
 *
 */
public class EstimatingtheAreaofaCircle {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0 0 0")) {
                break;
            }
            String[] sts = line.split(" ");
            double a = Double.parseDouble(sts[0]);
            double b = Double.parseDouble(sts[1]);
            double c = Double.parseDouble(sts[2]);

            double area = Math.PI * Math.pow(a, 2);
            double tarea = 4 * Math.pow(a, 2) * (c / b);

            w.write(String.valueOf(area) + " " + String.valueOf(tarea) + "\n");

        }
        w.flush();
        w.close();
        r.close();
    }

}

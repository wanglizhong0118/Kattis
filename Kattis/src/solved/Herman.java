package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/herman
 * 
 * @author allwi
 *
 */
public class Herman {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int radius = Integer.parseInt(r.readLine());

        double area = Math.PI * Math.pow(radius, 2);
        double tarea = Math.pow(radius, 2) * 2;

        w.write(String.valueOf(area) + "\n");
        w.write(String.valueOf(tarea) + "\n");

        w.flush();
        w.close();
        r.close();
    }

}

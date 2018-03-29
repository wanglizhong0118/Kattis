import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/quadrant
 * 
 * @author allwi
 *
 */
public class QuadrantSelection {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(r.readLine());
        int y = Integer.parseInt(r.readLine());

        if (x > 0 && y > 0) {
            w.write("1");
        } else if (x < 0 && y > 0) {
            w.write("2");
        } else if (x < 0 && y < 0) {
            w.write("3");
        } else {
            w.write("4");
        }
        w.flush();
        w.close();
        r.close();
    }

}

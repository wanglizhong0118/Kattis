import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/lineup
 * 
 * @author allwi
 *
 */
public class LineThemUp {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        int previous = 0;
        int current = 0;
        String first = r.readLine();
        for (int i = 1; i < n; i++) {
            String next = r.readLine();
            current = first.compareTo(next);
            if (current * previous < 0) {
                current = 0;
                break;
            } else {
                previous = current;
                first = next;
            }
        }
        if (current > 0) {
            w.write("DECREASING");
        } else if (current < 0) {
            w.write("INCREASING");
        } else {
            w.write("NEITHER");
        }
        w.flush();
        w.close();
        r.close();
    }

}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;

/**
 * https://open.kattis.com/problems/bestbefore
 * 
 * @author allwi
 *
 */
public class MarsWindow {

    public static void main(String[] args) throws IOException, ParseException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        if (n == 2018) {
            w.write("yes");
        } else if (n < 2018 || n > 10000) {
            w.write("no");
        } else {
            int firstMonth = (n - 2018) * 12 - 3;
            int lastMonth = (n - 2018) * 12 + 8;
            boolean isOptinal = false;
            for (int i = firstMonth; i <= lastMonth; i++) {
                if (i % 26 == 0) {
                    isOptinal = true;
                    break;
                }
            }
            if (isOptinal) {
                w.write("yes");
            } else {
                w.write("no");
            }
        }
        w.flush();
        w.close();
        r.close();

    }
}

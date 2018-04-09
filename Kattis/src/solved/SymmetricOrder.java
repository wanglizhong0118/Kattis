package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/symmetricorder
 * 
 * @author allwi
 *
 */
public class SymmetricOrder {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int set = 0;
        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n == 0) {
                break;
            }
            set++;
            w.write("SET " + String.valueOf(set) + "\n");
            List<String> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    w.write(r.readLine() + "\n");
                } else {
                    ls.add(r.readLine());
                }
            }
            for (int i = ls.size() - 1; i >= 0; i--) {
                w.write(ls.get(i) + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }
}

package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/owlandfox
 * 
 * @author allwi
 *
 */
public class TheOwlAndTheFox {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        while (n-- > 0) {
            String line = r.readLine();
            int cur = Integer.parseInt(line);
            int stand = (int) Math.pow(10, line.length());
            while (true) {
                if (cur % stand == 0) {
                    cur = cur - stand;
                    break;
                }
                stand = stand / 10;
            }
            w.write(String.valueOf(cur) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}

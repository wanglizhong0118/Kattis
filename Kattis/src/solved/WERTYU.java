package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/***
 * https://open.kattis.com/problems/wertyu
 * 
 * @author allwi
 *
 */
public class WERTYU {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String org = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        char space = ' ';
        String line;
        while ((line = r.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char current = line.charAt(i);
                if (current == space) {
                    w.write(" ");
                } else {
                    int pos = org.indexOf(current) - 1;
                    char after = org.charAt(pos);
                    w.write(after);
                }
            }
            w.write("\n");
            w.flush();
        }
        w.close();
        r.close();
    }
}

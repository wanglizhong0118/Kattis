package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/erase
 * 
 * @author allwi
 *
 */
public class EraseSecurely {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        final String s1 = r.readLine();
        final String s2 = r.readLine();
        if (n % 2 == 0) {
            if (s1.equals(s2)) {
                w.write("Deletion succeeded");
            } else {
                w.write("Deletion failed");
            }
        } else {
            boolean t = false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    t = true;
                    break;
                }
            }
            if (t) {
                w.write("Deletion failed");
            } else {
                w.write("Deletion succeeded");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
